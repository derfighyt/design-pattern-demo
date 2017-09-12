package com.liuli.design.demo.adapter;

/**
 * 适配器模式演示
 * 其实代码分层就是适配器模式，比如不希望controller直接调用dao方法，通过service方法做一次适配。
 * 在service里引用dao的方法。但是service会做一些其他的转换，也可以看成桥接或装饰模式。
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
