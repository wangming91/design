package com.wangming.pattern.creational.prototype;

import java.io.IOException;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Student student=new Student();
        student.setName("Bob");
        student.setAge(20);
        student.setBirthDay(new Date(0L));


        Student cloneStudent= (Student) student.clone();
        Student deepCloneStudent= (Student) student.deepClone();

        student.getBirthDay().setTime(666666666666666L);
        System.out.println("student:"+student);
        System.out.println("cloneStudent:"+cloneStudent);
        System.out.println("deepCloneStudent:"+deepCloneStudent);

        /*
        * 打印结果
        * Student无参构造器！
          student:Student{name='Bob', birthDay=Tue Oct 29 17:11:06 CST 23095, age=20}com.wangming.pattern.creational.prototype.Student@63947c6b
          cloneStudent:Student{name='Bob', birthDay=Tue Oct 29 17:11:06 CST 23095, age=20}com.wangming.pattern.creational.prototype.Student@27bc2616
          deepCloneStudent:Student{name='Bob', birthDay=Thu Jan 01 08:00:00 CST 1970, age=20}com.wangming.pattern.creational.prototype.Student@3941a79c
        *
        * 分析：
        *       当student生日对象值改变之后cloneStudent生日对象也改变了，说明两者指向的是同一个生日对象。
        *       deepCloneStudent生日对象没有改变
        * 结论：
        *       1：深克隆和浅克隆出来的对象都和原对象不是一个对象
        *       2：浅克隆只克隆到自己这一层，即当对象中仍然包含对象属性的时候，
        *          浅克隆出的对象的对象属性仍然是原对象的对象属性。例如本例中Date对象，
        *          可以发现当原对象生日对象改变之后，浅克隆的对象中的生日对象属性也发生了改变。
        *          深克隆则拷贝出的对象完全是新对象，包括对象属性。
        *
        * */

    }
}
