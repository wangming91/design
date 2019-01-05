package com.wangming.pattern.creational.simpleFactory;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/5 10:16
 * @Description:
 */

public class Test {
    public static void main(String[] args) throws Exception {
        //v1版本创建的方式
        Video video = null;
        {
            video = new JavaVideo();
            video.produce();
        }
        //v2版本创建的方式
        {
            video = VideoFactory.createVideo("java");
            video.produce();
        }
        {
            video = VideoFactory.createVideo(JavaVideo.class);
            video.produce();
        }


    }
}
