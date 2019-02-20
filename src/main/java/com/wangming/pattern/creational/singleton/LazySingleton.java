package com.wangming.pattern.creational.singleton;

/**
 * @Auther: ming.wang
 * @Date: 2019/1/6 19:25
 * @Description:
 */

public class LazySingleton {
    private static LazySingleton lazySingleton=null;
    private LazySingleton() {
    }

    public synchronized static LazySingleton getInstance(){
        if (null==lazySingleton)
        {
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }

}
