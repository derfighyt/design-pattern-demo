package com.liuli.design.demo.strategy;

/**
 * 策略模式演示
 * 策略模式的实际应用：
 * 1. java集合里的sort，传入自定义的Comparator作为策略。
 * 2. apache oltu初始化请求时，传入不同的Validator作为策略，对不同的请求类型进行校验
 *
 * 为什么不直接调用策略的方法？
 * 在简单的例子里直接调用效果是一样的，但有时除了策略算法操作以外还有其他的操作，
 * 如sort方法，策略仅比较元素大小，sort方法还需要根据比较结果排序
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        //new OperationAdd().doOperation(10, 5); 仅执行策略算法就能得到结果其实就不需要使用策略模式了。

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
