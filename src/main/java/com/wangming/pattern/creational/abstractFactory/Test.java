package com.wangming.pattern.creational.abstractFactory;



/**
 * @Auther: ming.wang
 * @Date: 2019/1/5 10:16
 * @Description: 现在需求变更，一门课程不仅需要录制视频还需要手记，此时可以使用抽象工厂模式
 */

public class Test {
    public static void main(String[] args) throws Exception {

        //
        CourseFactory courseFactory=new JavaCourseFactory();
        Article article = courseFactory.createArticle();
        Video video = courseFactory.createVideo();
        article.write();
        video.produce();

        /*如果此时需求进一步变更一门课程除了视频手记之外还需要增加源码部分
        * 
        * */

    }
}
