package com.liuli.design.demo.abstractFactory;

import com.liuli.design.demo.factory.Mouse;

/**
 * 抽象工厂类是用来封装工厂的
 */
public abstract class AbstractFactory {

    abstract Mouse createMouse();

    abstract Keyboard createKeyboard();
}
