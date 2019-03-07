package com.wangming.pattern.behavior.observer;

/**
 * @Author: ming.wang
 * @Date: 2019/3/7 11:02
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        WeixinPublic weixinPublic=new WeixinPublic("技术狂奔路");
        weixinPublic.addObserver(new ZhangSan("张三"));
        weixinPublic.addObserver(new Lisi("李四"));
        weixinPublic.publishNews("java设计模式该怎么学？");
    }
}
