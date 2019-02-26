package com.wangming.pattern.structural.adapter.exzample;

/**
 * @Author: ming.wang
 * @Date: 2019/2/25 17:39
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        DC5 dc5=new Adapter("220");
//        DC5 dc5=new Adapter("110");
        dc5.output5V();
    }
}
