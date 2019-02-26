package com.wangming.pattern.structural.adapter.classadapter;

/**
 * @Author: ming.wang
 * @Date: 2019/2/25 17:16
 * @Description:
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void finalBusiness() {
        System.out.println("其他的业务逻辑");
        super.changeBusiness();
        System.out.println("其他的业务逻辑");
    }
}
