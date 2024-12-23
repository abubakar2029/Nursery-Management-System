package models;

import enums.PlantCategory;
import enums.PlantWateringFrequency;

public class OutdoorPlant extends Plant {
    private PlantWateringFrequency wateringFrequency;

    public OutdoorPlant(String name, float price, PlantCategory category, PlantWateringFrequency wateringFrequency) {
        super(name, price, category);
        this.wateringFrequency = wateringFrequency;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Watering Frequency: " + wateringFrequency);
    }

    // Getters
    public PlantWateringFrequency getWateringFrequency() {
        return wateringFrequency;
    }

    //    Setters
    public PlantWateringFrequency setWateringFrequency(PlantWateringFrequency wateringFrequency) {
        this.wateringFrequency = wateringFrequency;
        return wateringFrequency;
    }
}
