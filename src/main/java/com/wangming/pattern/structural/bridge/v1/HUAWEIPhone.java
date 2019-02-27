package com.wangming.pattern.structural.bridge.v1;

/**
 * @Author: ming.wang
 * @Date: 2019/2/27 10:11
 * @Description:
 */
public class HUAWEIPhone extends AbstractPhone {
    @Override
    public void game() {
        System.out.println("华为手机游戏");
    }

    @Override
    public void mp3() {
        System.out.println("华为手机MP3");
    }
}
