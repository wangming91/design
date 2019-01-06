package com.wangming.pattern.creational.builder;

import com.google.common.collect.ImmutableSet;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/6 15:39
 * @Description:
 */

public class Test {
    public static void main(String[] args) {
        //v1
        {
            CourseBuilder builder = new CourseActualBuilder();
            Coach coach = new Coach();
            coach.setBuilder(builder);
            Course course = coach.makeCourse("java课程名称", "java课程PPT",
                    "java课程视频", "Java课程手记", "java课程问答");
            System.out.println(course);
        }
        //v2
        {

            com.wangming.pattern.creational.builder.v2.Course build = new com.wangming.pattern.creational.builder.v2.Course.CourseBuilder()
                    .buildCName("java课程名称")
                    .buildCPPT("java课程PPT")
                    .buildCVideo("java课程视频")
                    .buildCArticle("Java课程手记")
                    .buildCQA("java课程问答")
                    .build();
            System.out.println(build);
        }
        //guava中ImmutableSet使用了建造者模式
        ImmutableSet set=ImmutableSet.builder().add("hello")
                .add(" world")
                .add(" !")
                .build();
    }
}
