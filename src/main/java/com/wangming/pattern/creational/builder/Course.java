package com.wangming.pattern.creational.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/6 15:06
 * @Description:
 */
@Getter
@Setter
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
}
