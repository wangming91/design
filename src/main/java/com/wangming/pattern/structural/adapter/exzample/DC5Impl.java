package com.wangming.pattern.structural.adapter.exzample;

/**
 * @Author: ming.wang
 * @Date: 2019/2/25 17:20
 * @Description:
 */
public class DC5Impl implements DC5 {
    @Override
    public int output5V() {
        System.out.println("需要输出5V电压");
        return 5;
    }
}
