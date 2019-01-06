package com.wangming.pattern.creational.abstractFactory;


/**
 * @Auther: ming.wang
 * @Date: 2019/1/5 10:14
 * @Description:
 */

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制java视频！");
    }
}
