package com.wangming.pattern.structural.bridge.v3;


/**
 * @Author: ming.wang
 * @Date: 2019/2/27 10:11
 * @Description:
 */
public class HUAWEIPhone extends AbstractPhone {

    @Override
    public void run() {
        System.out.println("华为手机:");
        funcs.stream().forEach(x -> x.run());
    }
}
