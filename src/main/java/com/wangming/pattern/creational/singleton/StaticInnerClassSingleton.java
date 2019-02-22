package com.wangming.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @Author: ming.wang
 * @Date: 2019/2/20 15:46
 * @Description:
 */
public class StaticInnerClassSingleton implements Serializable {

    private StaticInnerClassSingleton() {
        if (null!=InnerClass.instance)
            throw new RuntimeException("禁止反射调用默认构造器");
    }

    private static class InnerClass{
        private static StaticInnerClassSingleton instance=new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
       return InnerClass.instance;
    }
    private Object readResolve()
    {
        return InnerClass.instance;
    }
}
