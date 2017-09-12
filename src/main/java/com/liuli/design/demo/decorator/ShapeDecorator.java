package com.liuli.design.demo.decorator;


/**
 * 装饰类的抽象，需要实现原始接口，具体会调用实现类的方法
 */
public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
