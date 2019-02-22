package com.wangming.pattern.structural.facade;

/**
 * @Author: ming.wang
 * @Date: 2019/2/22 15:38
 * @Description:
 */
public class QualifyService {
    public boolean isAvaliable(Gift gift){
        System.out.println("礼品"+gift.getName()+"资格校验通过(积分是否足够，库存是否足够等等)");
        return true;
    }
}
