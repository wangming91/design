package com.wangming.pattern.structural.decorator;

/**
 * @Auther: ming.wang
 * @Date: 2019/2/23 13:52
 * @Description: 具体的装饰类（香肠）
 */

public class SuasageDecorator extends AbstractDecorator {

    public SuasageDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getName() {
        return super.getName()+" 再加一根香肠";
    }

    @Override
    public long cost() {
        return super.cost()+2;
    }
}
