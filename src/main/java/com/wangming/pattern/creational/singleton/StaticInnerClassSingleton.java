package com.wangming.pattern.creational.singleton;

/**
 * @Author: ming.wang
 * @Date: 2019/2/20 15:46
 * @Description:
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {}

    private static class InnerClass{
        private static StaticInnerClassSingleton instance=new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
       return InnerClass.instance;
    }
}
