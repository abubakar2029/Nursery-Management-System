package models;

import enums.PlantCategory;
import enums.PlantLightRequirements;

public class IndoorPlant extends Plant {
    private PlantLightRequirements lightRequirement;
    private String temperature;

    public IndoorPlant(String name, float price, PlantCategory category, PlantLightRequirements lightRequirement, String temperature) {
        super(name, price, category);
        this.lightRequirement = lightRequirement;
        this.temperature = temperature;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("\nName: " + this.name + "\n Price: " + this.price + "\nCategory: " + this.category + "\ntemperature: " + this.temperature);
    }

    // Getters
    public PlantLightRequirements getLightRequirement() {
        return lightRequirement;
    }

    public String getTemperature() {
        return temperature;
    }

    //    Setters
    public PlantLightRequirements setLightRequirement(PlantLightRequirements lightRequirement) {
        this.lightRequirement = lightRequirement;
        return lightRequirement;
    }

    public String setTemperature(String temperature) {
        this.temperature = temperature;
        return temperature;
    }
}
