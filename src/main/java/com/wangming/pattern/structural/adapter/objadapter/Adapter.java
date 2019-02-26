package com.wangming.pattern.structural.adapter.objadapter;

/**
 * @Author: ming.wang
 * @Date: 2019/2/25 17:16
 * @Description:
 */
public class Adapter implements Target {

    Adaptee adaptee=new Adaptee();

    @Override
    public void finalBusiness() {
        System.out.println("其他的业务逻辑");
        adaptee.changeBusiness();
        System.out.println("其他的业务逻辑");
    }
}
