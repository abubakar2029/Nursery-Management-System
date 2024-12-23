package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Order {
    private final String date;
    private final float amount;
    private final String customerEmail;
    private final List<Plant> plantList;

    //  Using constructor overloading to make date param optional

    // Constructor with date given
    public Order(String date, String customerEmail, List<Plant> plantList) {
        this.date = date;
        this.amount = calculateTotalAmount(plantList);
        this.customerEmail = customerEmail;
        this.plantList = plantList;
        System.out.println("Order placed on: " + date);
        System.out.println("Total Amount: $" + amount);
    }

    // Constructor with date not given
    public Order(String customerEmail, List<Plant> plantList) {
        this.date = getCurrentDate();
        this.amount = calculateTotalAmount(plantList);
        this.customerEmail = customerEmail;
        this.plantList = plantList;
        System.out.println("\n========================= New Order =========================");
        System.out.println("Order placed on: " + date);
        System.out.println("Total Amount: $" + amount);
    }

    @Override
    public String toString() {
        return "Order [Date=" + date + ", Amount=" + amount + ", CustomerID=" + customerEmail + "]";
    }

    private String getCurrentDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return now.format(formatter);
    }

    private float calculateTotalAmount(List<Plant> plantList) {
        float total = 0;
        for (Plant plant : plantList) {
            total += plant.getPrice();
        }
        return total;
    }
}
