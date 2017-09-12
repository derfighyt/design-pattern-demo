package com.liuli.design.demo.factory;

/**
 * 用于构建鼠标实例的工厂类
 */
public class MouseFactory {

    public Mouse createMouse(String mouseType) {
        if(mouseType == null){
            return null;
        }
        if(mouseType.equalsIgnoreCase("DELL")){
            return new DellMouseImpl();
        } else if(mouseType.equalsIgnoreCase("HP")){
            return new HpMouseImpl();
        }

        return null;
    }
}
