package com.wangming.pattern.structural.bridge.v2;

/**
 * @Author: ming.wang
 * @Date: 2019/2/27 10:08
 * @Description: 手机品牌抽象类
 */
public abstract class AbstractPhone {

   public AbstractFunc func;

   public AbstractFunc getFunc() {
      return func;
   }

   public void setFunc(AbstractFunc func) {
      this.func = func;
   }

   public abstract void run();

}
