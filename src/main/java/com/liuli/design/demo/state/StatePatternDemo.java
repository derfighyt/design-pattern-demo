package com.liuli.design.demo.state;

/**
 * 状态模式演示
 * 状态模式和策略模式基本是一样的，只是关注点有一些差别。
 * 策略模式只是提供算法实现，供上下文使用，耦合度低一些
 * 状态模式是上下文把对自身的调用委托给状态实现类执行，同时状态实现类也可能会关注或修改上下文的状态
 *
 * 策略模式下client需要清楚自己选择什么策略得到什么结果
 * 状态模式下client只是调用上下文的方法，具体使用哪个状态实现类和状态的切换对client是透明的，client也不需要选择
 *
 * 涉及到状态的例子如Thread？但Thread并没有状态的实现类。
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        //此时状态是null，并不合理

        //StartState startState = new StartState();
        //startState.doAction(context);  原示例直接调用状态实现类的方法，感觉也不恰当
        //context.setState(startState);
        context.doAction();
        //这里取决于状态机，如果start状态执行完毕就跳转到stop状态，可以在start的方法里设置状态，但是需要状态之间互相能够知道
        System.out.println(context.getState().toString());

        //StopState stopState = new StopState();
        //stopState.doAction(context);
        //context.setState(stopState);
        context.doAction();

        System.out.println(context.getState().toString());
    }
}
