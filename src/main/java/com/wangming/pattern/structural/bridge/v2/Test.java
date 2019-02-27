package com.wangming.pattern.structural.bridge.v2;

/**
 * @Author: ming.wang
 * @Date: 2019/2/27 10:24
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        AbstractPhone xiaomi=new XiaomiPhone();
        xiaomi.setFunc(new Mp3Func());
        xiaomi.run();
    }
}
