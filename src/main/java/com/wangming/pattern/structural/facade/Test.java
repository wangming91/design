package com.wangming.pattern.structural.facade;

/**
 * @Author: ming.wang
 * @Date: 2019/2/22 15:35
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        Gift gift=new Gift();
        gift.setName("T恤");
        GiftExchangeFacadeService giftExchangeFacadeService=new GiftExchangeFacadeService();

        giftExchangeFacadeService.giftExchange(gift);
    }
}
