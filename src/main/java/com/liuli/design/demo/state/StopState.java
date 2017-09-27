package com.liuli.design.demo.state;

/**
 * 状态类
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(START);
    }

    public String toString(){
        return "Stop State";
    }
}
