package com.liuli.design.demo.decorator;

/**
 * 装饰器模式的演示
 * 这几个模式都很像，适配器，桥接，装饰器，都是扩展一个新的接口或抽象类，建一个实现类，保持对原始类的引用，通过新建的实现类来调用
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
