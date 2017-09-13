package com.liuli.design.demo.strategy;

/**
 * 策略实现
 */
public class OperationMultiply implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
