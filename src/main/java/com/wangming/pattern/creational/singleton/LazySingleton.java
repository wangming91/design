package com.wangming.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/6 19:25
 * @Description:
 */

public class LazySingleton implements Serializable {
    private static LazySingleton instance = null;
    private static boolean flag = true;

    private LazySingleton() {
        //对于懒加载模式，此种方式是不能抵御反射攻击的
       /* if (null != instance) {
            throw new RuntimeException("禁止反射调用默认构造器");
        }*/


       //对于懒加载方式，使用标志位的方式也并不能保证抵御反射攻击，因为利用反射可以修改标志位
      /*  if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("禁止反射调用默认构造器");
        }*/
    }

    public synchronized static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 为解决序列化和反序列化对单例的破坏
     * @return
     */
    private Object readResolve() {
        return instance;
    }

}
