package com.wangming.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @Author: ming.wang
 * @Date: 2019/2/20 17:04
 * @Description:
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton instance;

    static {
        instance = new HungrySingleton();
    }

    private HungrySingleton() {
        if (null != instance) {
            throw new RuntimeException("禁止反射调用默认构造器");
        }
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
