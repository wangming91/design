package com.wangming.pattern.structural.decorator;

/**
 * @Auther: ming.wang
 * @Date: 2019/2/23 13:50
 * @Description: 具体的装饰类（鸡蛋）
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String getName() {
        return super.getName()+" 再加一个鸡蛋";
    }

    @Override
    public long cost() {
        return super.cost()+1;
    }
}
