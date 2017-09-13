package com.liuli.design.demo.interpreter;

/**
 * 表达式接口
 */
public interface Expression {
    public boolean interpret(String context);
}
