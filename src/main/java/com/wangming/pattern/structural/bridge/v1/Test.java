package com.wangming.pattern.structural.bridge.v1;

/**
 * @Author: ming.wang
 * @Date: 2019/2/27 10:13
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        AbstractPhone xiaomi=new XiaomiPhone();
        AbstractPhone huawei=new HUAWEIPhone();

        xiaomi.game();
        huawei.game();
    }
}
