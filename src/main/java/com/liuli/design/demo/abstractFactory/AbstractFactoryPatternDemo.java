package com.liuli.design.demo.abstractFactory;

import com.liuli.design.demo.factory.Mouse;

/**
 * 抽象工厂类演示
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //如果是普通的工厂模式，需要同时使用两个工厂类
        //如果再继续增加新产品，就需要更多的工厂类
//        MouseFactory mouseFactory = new MouseFactory();
//        KeyboardFactory keyboardFactory = new KeyboardFactory();
//        Mouse dellMouse = mouseFactory.createMouse("DELL");
//        Keyboard dellKeyBoard = keyboardFactory.createKeyboard("DELL");
//        dellMouse.logo();
//        dellKeyBoard.logo();

        //把大量工厂类的细节通过抽象工厂模式再次封装，对客户端隐藏起来
        AbstractFactory factory = FactorySelector.useFactory("DELL");
        Mouse dellMouse = factory.createMouse();
        dellMouse.logo();
        Keyboard dellKeyboard = factory.createKeyboard();
        dellKeyboard.logo();

        //感觉有点问题，和工厂不一样了，工厂是根据客户端的选择创建不同产品，现在是创建一类产品
        //如果增加新的生产商，只需要实现产品接口，并继承AbstractFactory，实现自己的工厂类
        //但是如果增加了新的产品，则所有类都需要改动，影响较大
        //适合的场景是产品基本不变，会增加新的工厂的情况。


    }
}
