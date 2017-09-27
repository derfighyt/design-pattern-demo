package com.liuli.design.demo.state;

/**
 * 状态模式上下文
 */
public class Context {

    /** 上下文中保存当前状态，且允许状态实现类修改 */
    private State state;

    //为了让状态实现类能够方便的修改上下文状态，可以把所有状态实现成类常量
    //public static State START;
    //public static State STOP;

    public Context(){
        //START = new StartState();
        //STOP = new StopState();
        state = State.START;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public void doAction() {
        state.doAction(this);
    }

}
