package com.liuli.design.demo.builder;

/**
 * 具体食物实现
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    public String name() {
        return "Veg Burger";
    }
}
