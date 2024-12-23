import models.*;
import enums.*;

public class Main {
    public static void main(String[] args) {
        NurseryManager manager = NurseryManager.getInstance();
        Inventory inventory = Inventory.getInstance();

        //  initializing an indoor plant
        Plant indoorPlant = new IndoorPlant("Snake Plant", 15.99f, PlantCategory.INDOOR, PlantLightRequirements.LOW, "18 - 24C");
        manager.addPlant(indoorPlant, inventory);

        //  initializing an outdoor plant
        Plant outdoorPlant = new OutdoorPlant("Rose", 15.99f, PlantCategory.OUTDOOR, PlantWateringFrequency.LOW);
        manager.addPlant(outdoorPlant, inventory);

        //  Generate monthly reports
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateInventoryReport();

        //  Creating customer and Place Order
        Customer AbuBakar = new Customer("muhammadabubakar@gmail.com");
        Order order = new Order(AbuBakar.email, inventory.getPlantList()); // currently passing all plants list to buy. IN a complete application user will select plants and a selected List will be given in params

        //    RUNNING THE CODE AND CHECKING THE OUTPUTS HERE
        AbuBakar.viewOrderHistory();


    }
}