package com.wangming.pattern.creational.factoryMethod;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/5 14:38
 * @Description:
 */

public class HtmlVideoFactory extends VideoFactory {
    @Override
    public Video createVideo() throws Exception {
        return new HtmlVideo();
    }
}
