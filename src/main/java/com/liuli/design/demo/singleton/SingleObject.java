package com.liuli.design.demo.singleton;

/**
 * 单例对象类(非线程安全)
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        if (null == instance) {
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
