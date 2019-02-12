package com.wangming.pattern.creational.prototype;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.Date;

@Getter
@Setter
public class Student implements Serializable,Cloneable {

    private String name;
    private Date birthDay;
    private int age;

    public Student() {
        System.out.println("Student无参构造器！");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", age=" + age +
                '}'+super.toString();
    }

    //浅克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //深克隆
    public Object deepClone() throws IOException, ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bo=new ByteArrayOutputStream();
        ObjectOutputStream oo=new ObjectOutputStream(bo);
        oo.writeObject(this);

        //从流里读出来
        ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi=new ObjectInputStream(bi);

        return oi.readObject();
    }
}
