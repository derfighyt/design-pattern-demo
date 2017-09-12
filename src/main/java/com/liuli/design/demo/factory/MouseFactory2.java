package com.liuli.design.demo.factory;

/**
 * 使用反射机制，当鼠标厂商增加时，不需要修改工厂类
 */
public class MouseFactory2 {
    public static Object getClass(Class<?extends Mouse> clazz) {
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
