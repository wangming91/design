package com.wangming.pattern.structural.bridge.v3;

/**
 * @Author: ming.wang
 * @Date: 2019/2/27 10:24
 * @Description: 需求
 */
public class Test {
    public static void main(String[] args) {
        AbstractPhone xiaomi=new XiaomiPhone();
        xiaomi.addFunc(new Mp3Func());
        xiaomi.addFunc(new GameFunc());
        xiaomi.run();
    }
}
