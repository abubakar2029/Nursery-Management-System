package models;

import models.Inventory;

import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {

    //    This logic is incomplete I can't find its solution right now by myself
    private List<Customer> customerList = new ArrayList<>();

    public void generateInventoryReport() {
        Inventory inventory = Inventory.getInstance();
        System.out.println("\n========================= Inventory Report =========================");
        System.out.println("\nNumber of indoor plants:");
        inventory.getIndoorPlants();
        System.out.println("\nNumber of outdoor plants:");
        inventory.getIndoorPlants();
    }

    public void generateSalesReport() {

    }
}
