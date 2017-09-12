package com.liuli.design.demo.builder;

/**
 * 表示食物的接口
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
