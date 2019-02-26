package com.wangming.pattern.structural.composite.exzample;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: ming.wang
 * @Date: 2019/2/26 15:34
 * @Description: 相当于叶子构件
 */
@Getter
@Setter
@ToString
public class Department extends AbstractOrganization {

    private String name;
    private int count;

    public Department(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public int countEmp() {

        System.out.println(name+ "正在统计中。。");
        System.out.println("统计结果- 人数 :" +count);
        System.out.println();
        return count;
    }
}
