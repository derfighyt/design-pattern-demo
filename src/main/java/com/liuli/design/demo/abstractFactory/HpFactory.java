package com.liuli.design.demo.abstractFactory;

import com.liuli.design.demo.factory.HpMouseImpl;
import com.liuli.design.demo.factory.Mouse;

/**
 * HP的工厂类，生产HP的鼠标和键盘
 */
public class HpFactory extends AbstractFactory {
    @Override
    Mouse createMouse() {
        return new HpMouseImpl();
    }

    @Override
    Keyboard createKeyboard() {
        return new HpKeyboardImpl();
    }
}
