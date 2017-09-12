package com.liuli.design.demo.factory;

/**
 * 使用工厂类获取鼠标，而不是直接new
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        MouseFactory mouseFactory = new MouseFactory();

        //获取 DellMouseImpl 的对象，并调用它的 logo 方法
        Mouse dellMouse = mouseFactory.createMouse("DELL");

        //调用 DellMouseImpl 的 logo 方法
        dellMouse.logo();

        //获取 HpMouseImpl 的对象，并调用它的 logo 方法
        Mouse hpMouse = mouseFactory.createMouse("HP");

        //调用 HpMouseImpl 的 draw 方法
        hpMouse.logo();

    }
}
