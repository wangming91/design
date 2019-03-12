package com.wangming.pattern.behavior.command;

import com.sun.media.sound.FFT;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: ming.wang
 * @Date: 2019/3/11 16:44
 * @Description:
 */
public class Test {
    public static void concurrenceTest() {
        /**
         * 模拟高并发情况代码
         */
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final CountDownLatch begin = new CountDownLatch(1000); // 相当于计数器，当所有都准备好了，再一起执行，模仿多并发，保证并发量
        final CountDownLatch end = new CountDownLatch(1000); // 保证所有线程执行完了再打印atomicInteger的值
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        try {
            for (int i = 0; i < 1000; i++) {
                executorService.submit(() -> {
                    try {
                        begin.await(); //一直阻塞当前线程，直到计时器的值为0,保证同时并发
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //每个线程增加1000次，每次加1
                    for (int j = 0; j < 1000; j++) {
                        atomicInteger.incrementAndGet();
                    }
                    end.countDown();
                });
                System.out.println(i);
                begin.countDown();
            }
            end.await();// 保证所有线程执行完
            System.out.println(atomicInteger);
            executorService.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CommandManager commandManager = new CommandManager();
        SQLExcute sqlExcute = new SQLExcute();
        InsertIntoCommand intoCommand1 = new InsertIntoCommand(sqlExcute, "1");
        InsertIntoCommand intoCommand2 = new InsertIntoCommand(sqlExcute, "2");
        System.out.println("执行命令");
        commandManager.excute(intoCommand1);
        commandManager.excute(intoCommand2);

        System.out.println("执行undo");
        commandManager.uodo();
        commandManager.uodo();

        System.out.println("执行redo");
        commandManager.redo();
        commandManager.redo();

    }
}
