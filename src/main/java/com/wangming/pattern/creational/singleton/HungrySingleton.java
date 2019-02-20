package com.wangming.pattern.creational.singleton;

/**
 * @Author: ming.wang
 * @Date: 2019/2/20 17:04
 * @Description:
 */
public class HungrySingleton {
    private final static HungrySingleton instance;

    static {
        instance=new HungrySingleton();
    }
    private HungrySingleton() {
    }

    public HungrySingleton getInstance(){
        return instance;
    }
}
