package com.liuli.design.demo.builder;

/**
 * 具体食物实现类
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    public String name() {
        return "Coke";
    }
}
