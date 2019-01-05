package com.wangming.pattern.creational.factoryMethod;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/5 14:37
 * @Description:
 */

public class HtmlVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Html视频！");
    }
}
