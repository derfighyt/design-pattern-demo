package com.liuli.design.demo.builder;

/**
 * 实现Item接口的高级抽象类
 */
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
