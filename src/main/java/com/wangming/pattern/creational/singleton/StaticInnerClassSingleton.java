package com.wangming.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @Author: ming.wang
 * @Date: 2019/2/20 15:46
 * @Description:
 */
public class StaticInnerClassSingleton implements Serializable {

    private StaticInnerClassSingleton() {}

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
