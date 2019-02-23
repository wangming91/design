package com.wangming.pattern.structural.decorator;

/**
 * @Auther: ming.wang
 * @Date: 2019/2/23 13:53
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        Cake cake=new SuasageDecorator(new EggDecorator(new Battercake()));

        System.out.println(cake.getName()+ " 总计："+cake.cost());

    }
}
