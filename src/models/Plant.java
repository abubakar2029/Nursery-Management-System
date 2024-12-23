package models;

import enums.PlantCategory;

public class Plant {
    protected String name;
    protected float price;
    protected PlantCategory category;

    public Plant(String name, float price, PlantCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void displayInfo() {
        System.out.println("Plant: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }

    @Override
    public String toString() {
        return String.format("Plant{name='%s', price=%.2f}", name, price);
    }

    // Getters and Setters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public PlantCategory getCategory() { return category; }
}
