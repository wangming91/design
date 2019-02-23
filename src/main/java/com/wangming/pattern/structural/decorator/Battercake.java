package com.wangming.pattern.structural.decorator;

/**
 * @Auther: ming.wang
 * @Date: 2019/2/23 13:47
 * @Description:
 */

public class Battercake extends Cake {
    @Override
    public String getName() {
        return "煎饼";
    }

    @Override
    public long cost() {
        return 3;
    }
}
