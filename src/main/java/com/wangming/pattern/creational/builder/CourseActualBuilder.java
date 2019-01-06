package com.wangming.pattern.creational.builder;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/6 15:24
 * @Description:
 */

public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();

    @Override
    public void buildCName(String cName) {
        course.setCName(cName);
    }

    @Override
    public void buildCPPT(String cPPT) {
        course.setCPPT(cPPT);
    }

    @Override
    public void buildCVideo(String cVideo) {
        course.setCVideo(cVideo);
    }

    @Override
    public void buildCArticle(String cArticle) {
        course.setCArticle(cArticle);
    }

    @Override
    public void buildCQA(String cQA) {
        course.setCQA(cQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }

}
