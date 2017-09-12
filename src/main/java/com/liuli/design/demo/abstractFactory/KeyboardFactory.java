package com.liuli.design.demo.abstractFactory;

/**
 * 按照普通工厂模式，增加了一个新的产品，就需要新的工厂类
 */
public class KeyboardFactory {
    public Keyboard createKeyboard(String keyboardType) {
        if(keyboardType == null){
            return null;
        }
        if(keyboardType.equalsIgnoreCase("DELL")){
            return new DellKeyboardImpl();
        } else if(keyboardType.equalsIgnoreCase("HP")){
            return new HpKeyboardImpl();
        }

        return null;
    }
}
