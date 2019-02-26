package com.wangming.pattern.structural.adapter.exzample;

/**
 * @Author: ming.wang
 * @Date: 2019/2/25 17:32
 * @Description:
 */
public class Adapter implements DC5{

    private String type;

    public Adapter(String type) {
        this.type = type;
    }

    @Override
    public int output5V() {
        int result=0;
        switch (type) {//switch方式可以换成工厂模式
            case "110":
            {
                AC110 ac110=new AC110();
                int output220V = ac110.output110V();
                //变压
                result = output220V / 22;
                System.out.println("输入电压:"+output220V+"输出电压:"+result);
            }
                break;
            case "220": {
                AC220 ac220=new AC220();
                int output220V = ac220.output220V();
                //变压
                result = output220V / 44;
                System.out.println("输入电压:"+output220V+"输出电压:"+result);
            }
                break;
        }
        return result;
    }
}
