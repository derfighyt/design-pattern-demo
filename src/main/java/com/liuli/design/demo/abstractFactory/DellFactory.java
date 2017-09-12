package com.liuli.design.demo.abstractFactory;

import com.liuli.design.demo.factory.DellMouseImpl;
import com.liuli.design.demo.factory.Mouse;

/**
 * Dell的工厂，生产Dell品牌的鼠标与键盘
 */
public class DellFactory extends AbstractFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouseImpl();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboardImpl();
    }
}
