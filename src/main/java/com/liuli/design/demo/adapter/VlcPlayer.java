package com.liuli.design.demo.adapter;

/**
 * 高级播放器实现
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {
        //什么也不做
    }
}
