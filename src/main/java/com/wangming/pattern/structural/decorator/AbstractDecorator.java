package com.wangming.pattern.structural.decorator;

/**
 * @Auther: ming.wang
 * @Date: 2019/2/23 13:48
 * @Description: 抽象装饰类
 */
public abstract class AbstractDecorator extends Cake {

    private Cake cake;

    public AbstractDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getName() {
        return cake.getName();
    }

    @Override
    public long cost() {
        return cake.cost();
    }
}
