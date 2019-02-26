package com.wangming.pattern.structural.composite;

import java.io.File;

/**
 * @Author: ming.wang
 * @Date: 2019/2/26 11:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxC=new Course("linux课程",12);
        CatalogComponent windowsC=new Course("windows课程",15);


        CatalogComponent javaCog=new CourseCatalog("java课程目录",2);

        CatalogComponent mallC1=new Course("电商一期",33);
        CatalogComponent mallC2=new Course("电商二期",44);
        CatalogComponent design=new Course("Java设计模式",55);

        javaCog.add(mallC1);
        javaCog.add(mallC2);
        javaCog.add(design);

        CatalogComponent mainlog=new CourseCatalog("主目录",1);
        mainlog.add(linuxC);
        mainlog.add(windowsC);
        mainlog.add(javaCog);


        mainlog.print();
    }
}
