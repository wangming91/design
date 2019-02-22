package com.wangming.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * @Author: ming.wang
 * @Date: 2019/2/21 16:05
 * @Description: 使用反射或反序列化来破坏单例
 */
public class DestroySingletonTest {


    public static void main(String[] args) throws Exception {
        //序列化方式破坏单例   测试
        serializeDestroyMethod();

        //反射方式破坏单例模式 测试
//        reflectMethod();

    }

    private static void reflectMethod() throws  Exception {

//        reflectHungryMethod();
//        reflectLazyMethod();
        reflectLazyMethod2();

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

    /**
     * 验证使用对象空判断是否可抵御反射攻击
     * @throws Exception
     */
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

    /**
     * 验证使用标志位是否可抵御反射攻击
     * @throws Exception
     */
    private static void reflectLazyMethod2() throws Exception {
        LazySingleton lazySingleton = null;
        LazySingleton lazySingleton_new = null;

        Class singletonClass = LazySingleton.class;
        Constructor declaredConstructor = singletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        lazySingleton_new = (LazySingleton) declaredConstructor.newInstance();
        Field flag = singletonClass.getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(lazySingleton_new,true);
        lazySingleton = LazySingleton.getInstance();

        System.out.println(lazySingleton == lazySingleton_new);
    }


    private static void serializeDestroyMethod() throws IOException, ClassNotFoundException {
//        HungrySingleton intance=null;
//        HungrySingleton intance_new=null;

//        StaticInnerClassSingleton intance = null;
//        StaticInnerClassSingleton intance_new = null;

        EnumInstance intance = null;
        EnumInstance intance_new = null;

//        hungrySingleton=HungrySingleton.getInstance();
//        intance = StaticInnerClassSingleton.getInstance();
        intance=EnumInstance.getInstance();
        intance.setBirthDay(new Date());

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(intance);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
//        hungrySingleton_new= (HungrySingleton) ois.readObject();
//        intance_new = (StaticInnerClassSingleton) ois.readObject();
        intance_new = (EnumInstance) ois.readObject();

        System.out.println(intance == intance_new);
        System.out.println(intance.getBirthDay() == intance_new.getBirthDay());
    }
}
