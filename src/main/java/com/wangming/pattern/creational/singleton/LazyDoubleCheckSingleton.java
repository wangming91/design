package com.wangming.pattern.creational.singleton;

/**
 * @Author: ming.wang
 * @Date: 2019/2/20 14:45
 * @Description:
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton instance=null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance(){
        if (null==instance) {//第一个 if(instance==null)，其实是为了解决代码中的效率问题，只有instance为null的时候，才进入synchronized的代码段,大大减少了几率。
            synchronized (LazyDoubleCheckSingleton.class) {
                if (null==instance) {//第二个if(instance==null)，则是为了防止可能出现多个实例的情况。
                    instance=new LazyDoubleCheckSingleton();
                    /*
                    * 1.分配内存给这对象
                    * 2.初始化对象
                    * 3.设置instance指向刚刚分配的内存空间（执行完这步 instance才是非 null了）
                    * 其中2和3会指令重排序，执行顺序可能为123或132
                    * */
                }
            }
        }
        return instance;

    }
}
