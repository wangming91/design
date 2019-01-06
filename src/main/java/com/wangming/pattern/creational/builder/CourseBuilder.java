package com.wangming.pattern.creational.builder;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/6 15:24
 * @Description:
 */

public abstract class CourseBuilder {

    public abstract void buildCName(String cName);

    public abstract void buildCPPT(String cPPT);

    public abstract void buildCVideo(String cVideo);

    public abstract void buildCArticle(String cArticle);

    public abstract void buildCQA(String cQA);

    public abstract Course makeCourse();
}
