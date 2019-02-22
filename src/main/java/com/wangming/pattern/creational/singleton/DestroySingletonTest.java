package com.wangming.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: ming.wang
 * @Date: 2019/2/21 16:05
 * @Description: 使用反射或反序列化来破坏单例
 */
public class DestroySingletonTest {


    public static void main(String[] args) throws Exception {
        //序列化方式破坏单例   测试
//        serializeDestroyMethod();


        //反射方式破坏单例模式 测试
        reflectMethod();

    }

    private static void reflectMethod() throws  Exception {

//        reflectHungryMethod();
        reflectLazyMethod();

    }

    private static void reflectHungryMethod() throws Exception {
        //同理StaticInnerClassSingleton

        HungrySingleton hungrySingleton = null;
        HungrySingleton hungrySingleton_new = null;

        Class singletonClass = HungrySingleton.class;
        Constructor declaredConstructor = singletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        hungrySingleton = HungrySingleton.getInstance();
        hungrySingleton_new = (HungrySingleton) declaredConstructor.newInstance();

        System.out.println(hungrySingleton == hungrySingleton_new);
    }

    private static void reflectLazyMethod() throws Exception {
        LazySingleton lazySingleton = null;
        LazySingleton lazySingleton_new = null;

        Class singletonClass = LazySingleton.class;
        Constructor declaredConstructor = singletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        lazySingleton = LazySingleton.getInstance();
        lazySingleton_new = (LazySingleton) declaredConstructor.newInstance();

        System.out.println(lazySingleton == lazySingleton_new);
    }


    private static void serializeDestroyMethod() throws IOException, ClassNotFoundException {
//        HungrySingleton hungrySingleton=null;
//        HungrySingleton hungrySingleton_new=null;

        StaticInnerClassSingleton hungrySingleton = null;
        StaticInnerClassSingleton hungrySingleton_new = null;

//        hungrySingleton=HungrySingleton.getInstance();
        hungrySingleton = StaticInnerClassSingleton.getInstance();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(hungrySingleton);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
//        hungrySingleton_new= (HungrySingleton) ois.readObject();
        hungrySingleton_new = (StaticInnerClassSingleton) ois.readObject();

        System.out.println(hungrySingleton == hungrySingleton_new);
    }
}
