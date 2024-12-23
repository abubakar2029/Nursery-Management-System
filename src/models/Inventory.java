package models;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Plant> plantList = new ArrayList<>();
    private int totalIndoorPlants = 0;
    private int totalOutdoorPlants = 0;

    public void addPlant(Plant plant) {
        plantList.add(plant);
        if (plant instanceof IndoorPlant) {
            totalIndoorPlants++;
        } else if (plant instanceof OutdoorPlant) {
            totalOutdoorPlants++;
        }
    }

    public void removePlant(Plant plant) {
        plantList.remove(plant);
        if (plant instanceof IndoorPlant) {
            totalIndoorPlants--;
        } else if (plant instanceof OutdoorPlant) {
            totalOutdoorPlants--;
        }
    }

    public void updatePlant(Plant oldPlant, Plant newPlant) {
        int index = plantList.indexOf(oldPlant);
        if (index != -1) {
            plantList.set(index, newPlant);
        }
    }

    public void getIndoorPlants() {
        List<Plant> indoorPlants = new ArrayList<>();
        for (Plant plant : plantList) {
            if (plant instanceof IndoorPlant) {
                indoorPlants.add(plant);
            }
        }
        System.out.println(indoorPlants.toString());
    }

    public void getOutdoorPlants() {
        List<Plant> outdoorPlants = new ArrayList<>();
        for (Plant plant : plantList) {
            if (plant instanceof OutdoorPlant) {
                outdoorPlants.add(plant);
            }
        }
        System.out.println(outdoorPlants.toString());
    }

    // Getters and Setters
    public void getPlantList() {
        System.out.println(plantList.toString());
    }
}