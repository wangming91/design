package com.wangming.pattern.structural.facade;

/**
 * @Author: ming.wang
 * @Date: 2019/2/22 15:46
 * @Description:
 */
public class GiftExchangeFacadeService {
    private QualifyService qualifyService=new QualifyService();
    private PaymentService paymentService=new PaymentService();
    private ShippingService shippingService=new ShippingService();

    public void giftExchange(Gift gift){
        //资格校验通过
        if (qualifyService.isAvaliable(gift))
        {
            //支付系统完成
            if (paymentService.pay(gift))
            {
                String orderNo = shippingService.shipGift(gift);//获取订单号
                System.out.println("物流系统下单成功，订单号是："+orderNo);
            }
        }
    }
}
