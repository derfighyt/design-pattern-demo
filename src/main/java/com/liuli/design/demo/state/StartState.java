package com.liuli.design.demo.state;

/**
 * 状态类
 */
public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(STOP); //切换上下文的状态
    }

    public String toString(){
        return "Start State";
    }
}
