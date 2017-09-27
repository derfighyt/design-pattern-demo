package com.liuli.design.demo.state;

/**
 * 状态接口
 */
public interface State {
    //也可以把确定的状态放到接口里，语义上可能更合理
    State START = new StartState();
    State STOP = new StopState();

    void doAction(Context context);
}
