package com.liuli.design.demo.builder;

/**
 * 具体食物实现类
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "Pepsi";
    }
}
