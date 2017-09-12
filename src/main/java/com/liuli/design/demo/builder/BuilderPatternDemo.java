package com.liuli.design.demo.builder;

/**
 * 建造者模式演示
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.vegMealBuilder();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.nonVegMealBuilder();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());

        //另一种写法的演示
        NewMeal newVegMeal = new NewMeal.Builder()
                .vegBurger()
                .coke()
                .build();

        System.out.println("Veg Meal");
        newVegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());
    }
}
