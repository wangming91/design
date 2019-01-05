package com.wangming.pattern.creational.factoryMethod;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/5 10:16
 * @Description:
 */

public class Test {
    public static void main(String[] args) throws Exception {

        {
            VideoFactory videoFactory = new JavaVideoFactory();
            Video video = videoFactory.createVideo();
            video.produce();
        }

        //当需要扩展的时候，比如要新增一个Html视频
        {
            VideoFactory videoFactory=new HtmlVideoFactory();
            Video video = videoFactory.createVideo();
            video.produce();
        }
    }
}
