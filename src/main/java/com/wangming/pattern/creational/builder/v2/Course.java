package com.wangming.pattern.creational.builder.v2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/6 15:06
 * @Description:
 */
@ToString
public class Course {
    //课程名称
    private String cName;
    //课程ppt
    private String cPPT;
    //课程视频
    private String cVideo;
    //课程手记
    private String cArticle;
    //课程问答
    private String cQA;

    public Course(CourseBuilder builder) {
        this.cName = builder.cName;
        this.cPPT = builder.cPPT;
        this.cVideo = builder.cVideo;
        this.cArticle = builder.cArticle;
        this.cQA = builder.cQA;
    }

    public static class CourseBuilder {
        //课程名称
        private String cName;
        //课程ppt
        private String cPPT;
        //课程视频
        private String cVideo;
        //课程手记
        private String cArticle;
        //课程问答
        private String cQA;

        public CourseBuilder buildCName(String cName) {
            this.cName = cName;
            return this;
        }

        public CourseBuilder buildCPPT(String cPPT) {
            this.cPPT = cPPT;
            return this;
        }

        public CourseBuilder buildCVideo(String cVideo) {
            this.cVideo = cVideo;
            return this;
        }

        public CourseBuilder buildCArticle(String cArticle) {
            this.cArticle = cArticle;
            return this;
        }

        public CourseBuilder buildCQA(String cQA) {
            this.cQA = cQA;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }

}
