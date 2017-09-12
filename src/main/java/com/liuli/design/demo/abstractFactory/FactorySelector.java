package com.liuli.design.demo.abstractFactory;

/**
 * 选择需要使用的一组工厂类(同一个产品族)
 */
public class FactorySelector {
    public static AbstractFactory useFactory(String factory) {
        if (factory.equalsIgnoreCase("DELL")) {
            return new DellFactory();
        } else if (factory.equalsIgnoreCase("HP")) {
            return new HpFactory();
        }
        return null;
    }
}
