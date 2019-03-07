package com.wangming.pattern.behavior.observer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: ming.wang
 * @Date: 2019/3/7 10:46
 * @Description:
 */
@Getter
@Setter
@ToString
public class Lisi implements Observer {

    private String name;

    public Lisi(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        WeixinPublic weixinPublic= (WeixinPublic) o;
        String content= (String) arg;
        System.out.println(name+"，您关注的"+weixinPublic.getName()+"有新的更新，内容是:"+content);

    }
}
