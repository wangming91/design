package com.wangming.pattern.creational.singleton;

import java.io.*;

/**
 * @Author: ming.wang
 * @Date: 2019/2/21 16:05
 * @Description: 使用反射或反序列化来破坏单例
 */
public class DestroySingletonTest {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化方式破坏单例   测试
        serializeDestroyMethod();

    }

    private static void serializeDestroyMethod() throws IOException, ClassNotFoundException {
        HungrySingleton hungrySingleton=null;
        HungrySingleton hungrySingleton_new=null;

        hungrySingleton=HungrySingleton.getInstance();

        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(hungrySingleton);

        ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        hungrySingleton_new= (HungrySingleton) ois.readObject();

        System.out.println(hungrySingleton==hungrySingleton_new);
    }
}
