package com.wangming.pattern.creational.simpleFactory;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/5 10:14
 * @Description:
 */

public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python视频！");
    }
}
