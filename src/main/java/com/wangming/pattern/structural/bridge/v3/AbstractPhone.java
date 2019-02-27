package com.wangming.pattern.structural.bridge.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ming.wang
 * @Date: 2019/2/27 10:08
 * @Description:
 */
public abstract class AbstractPhone {

   public List<AbstractFunc> funcs=new ArrayList<>();

   public void addFunc(AbstractFunc func) {
      funcs.add(func);
   }

   public abstract void run();
}
