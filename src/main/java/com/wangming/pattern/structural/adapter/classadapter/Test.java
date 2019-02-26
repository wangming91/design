package com.wangming.pattern.structural.adapter.classadapter;

/**
 * @Author: ming.wang
 * @Date: 2019/2/25 17:16
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.finalBusiness();
    }
}
