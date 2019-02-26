package com.wangming.pattern.structural.composite;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: ming.wang
 * @Date: 2019/2/26 11:03
 * @Description:
 */
@Getter
@Setter
@ToString
public class Course extends CatalogComponent {
    private String name;
    private double price;

    @Override
    public String getName(CatalogComponent component) {
        return name;
    }

    @Override
    public double getPrice(CatalogComponent component) {
        return price;
    }

    @Override
    public void print( ) {
        System.out.println("Course Name:"+name+" price:"+price);
    }

    public Course(String name, double price) {


        this.name = name;
        this.price = price;
    }
}
