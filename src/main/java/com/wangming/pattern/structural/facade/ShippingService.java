package com.wangming.pattern.structural.facade;

/**
 * @Author: ming.wang
 * @Date: 2019/2/22 15:44
 * @Description:
 */
public class ShippingService {
    public String shipGift(Gift gift){
        //物流系统对接逻辑
        System.out.println(gift.getName()+"：进入物流系统");
        return "666";//订单号
    }
}
