package com.liuli.design.demo.builder;

/**
 * 实现Item接口的高级抽象类
 */
public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
