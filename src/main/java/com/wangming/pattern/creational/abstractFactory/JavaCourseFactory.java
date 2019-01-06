package com.wangming.pattern.creational.abstractFactory;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/5 22:37
 * @Description:
 */

public class JavaCourseFactory extends CourseFactory {
    @Override
    public Video createVideo() {
        return new JavaVideo();
    }

    @Override
    public Article createArticle() {
        return new JavaArticle();
    }
}
