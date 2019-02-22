package com.wangming.pattern.structural.facade;

/**
 * @Author: ming.wang
 * @Date: 2019/2/22 15:41
 * @Description:
 */

public class PaymentService {
    public boolean pay(Gift gift){
        System.out.println("礼品"+gift.getName()+"积分支付成功(包括扣减积分等操作)");
        return true;
    }
}
