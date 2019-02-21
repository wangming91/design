package com.wangming.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/6 19:25
 * @Description:
 */

public class LazySingleton implements Serializable {
    private static LazySingleton instance =null;
    private LazySingleton() {
    }

    public synchronized static LazySingleton getInstance(){
        if (null== instance)
        {
            instance =new LazySingleton();
        }
        return instance;
    }
    private Object readResolve()
    {
        return instance;
    }

}
