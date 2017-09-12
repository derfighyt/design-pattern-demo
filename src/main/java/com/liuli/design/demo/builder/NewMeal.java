package com.liuli.design.demo.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式的另一种例子，使用静态内部类来构建
 */
public class NewMeal {
    private List<Item> items = new ArrayList<Item>();

    private NewMeal(List<Item> items) {
        this.items.addAll(items);
    }

    public static class Builder {
        private final List<Item> itemList = new ArrayList<Item>();

        public Builder() {
        }

        public Builder vegBurger() {
            itemList.add(new VegBurger());
            return this;
        }

        public Builder chickenBurger() {
            itemList.add(new ChickenBurger());
            return this;
        }

        public Builder coke() {
            itemList.add(new Coke());
            return this;
        }

        public Builder pepsi() {
            itemList.add(new Pepsi());
            return this;
        }

        public NewMeal build() {
            return new NewMeal(itemList);
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
