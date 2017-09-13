package com.liuli.design.demo.mediator;

/**
 * 中介模式演示
 * 理解是发送消息不直接把消息放到聊天室，而是通过User这个中介类来处理，解耦调用方和聊天室
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
