package com.wangming.pattern.creational.builder;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/6 15:35
 * @Description:
 */

public class Coach {
    private CourseBuilder builder;

    public void setBuilder(CourseBuilder builder) {
        this.builder = builder;
    }

    public Course makeCourse(String cName, String cPPt
            , String cVideo, String cAticle, String cQA) {
        builder.buildCName(cName);
        builder.buildCPPT(cPPt);
        builder.buildCVideo(cVideo);
        builder.buildCArticle(cAticle);
        builder.buildCQA(cQA);
        return builder.makeCourse();
    }
}
