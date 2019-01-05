package com.wangming.pattern.creational.factoryMethod;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/5 14:14
 * @Description:
 */

public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video createVideo() throws Exception {
        return new JavaVideo();
    }
}
