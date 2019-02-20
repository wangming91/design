package com.wangming.pattern.creational.singleton;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/6 19:27
 * @Description:
 */

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("=========");
    }

}

class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance=LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton instance=StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
