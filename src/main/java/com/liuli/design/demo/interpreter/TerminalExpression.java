package com.liuli.design.demo.interpreter;

/**
 * 表达式实现类
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
