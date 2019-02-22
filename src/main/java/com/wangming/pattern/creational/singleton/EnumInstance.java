package com.wangming.pattern.creational.singleton;

import java.util.Date;

/**
 * @Author: ming.wang
 * @Date: 2019/2/22 14:05
 * @Description: 枚举实现单例
 */
public enum EnumInstance {
    INSTANCE,;
    private Date birthDay;//单例类的属性

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public static EnumInstance getInstance()
    {
        return INSTANCE;
    }
}
