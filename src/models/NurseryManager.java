package models;

public class NurseryManager {
    private static NurseryManager instance;

    private NurseryManager() {
    }

    public static NurseryManager getInstance() {
        if (instance == null) {
            instance = new NurseryManager();
        }
        return instance;
    }

    public void addPlant(Plant plant, Inventory inventory) {
        inventory.addPlant(plant);
        System.out.println("Plant added: " + plant.getName());
    }

    public void removePlant(Plant plant, Inventory inventory) {
        inventory.removePlant(plant);
        System.out.println("Plant removed: " + plant.getName());
    }

    public void updatePlant(Plant oldPlant, Plant newPlant, Inventory inventory) {
        inventory.updatePlant(oldPlant,newPlant);
        System.out.println("Plant updated: " + newPlant.getName());
    }
}

