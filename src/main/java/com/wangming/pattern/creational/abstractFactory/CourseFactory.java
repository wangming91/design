package com.wangming.pattern.creational.abstractFactory;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/5 22:33
 * @Description:
 */

public abstract class CourseFactory {

    public abstract Video createVideo();

    public abstract Article createArticle();
}
