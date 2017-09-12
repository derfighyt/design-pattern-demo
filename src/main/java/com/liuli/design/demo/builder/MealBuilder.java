package com.liuli.design.demo.builder;

/**
 * 负责创建Meal对象，客户端不需要自己建造Meal对象然后添加Item
 */
public class MealBuilder {
    public Meal vegMealBuilder() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal nonVegMealBuilder() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
