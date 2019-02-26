package com.wangming.pattern.structural.composite.exzample;

/**
 * @Author: ming.wang
 * @Date: 2019/2/26 15:31
 * @Description: 抽象类或者接口都可以
 */
public abstract class AbstractOrganization {
    public abstract int countEmp();//计算员工数量

    public void add(AbstractOrganization organization) {
        new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(AbstractOrganization organization) {
        new UnsupportedOperationException("不支持删除操作");
    }
}
