package com.liuli.design.demo.prototype;

/**
 * 原型模式演示
 * 使用原型模式创建对象比直接new一个对象在性能上要好的多，因为Object类的clone方法是一个本地方法，
 * 它直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显。所以在需要重复地创建相似对象时可以考虑使用原型模式。
 * 比如需要在一个循环体内创建对象，假如对象创建过程比较复杂或者循环次数很多的话，
 * 使用原型模式不但可以简化创建过程，而且可以使系统的整体性能提高很多。
 *
 * 浅克隆，如果对象里存的是基本类型没有影响，如果存复杂类型复制的是一份引用，
 * 如果有不支持克隆的引用无法使用
 * 不调用类的构造方法，如果构造方法里有特殊处理也不能用
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
