package com.wangming.pattern.behavior.observer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Observable;

/**
 * @Author: ming.wang
 * @Date: 2019/3/7 10:46
 * @Description:
 */
@Getter
@Setter
@ToString
public class WeixinPublic extends Observable {

    private String name;

    public WeixinPublic(String name) {
        this.name = name;
    }

    public void publishNews(String content){
        System.out.println(name+"发布新消息来，内容是:"+content+"。");
        setChanged();
        notifyObservers(content);
    }

}
