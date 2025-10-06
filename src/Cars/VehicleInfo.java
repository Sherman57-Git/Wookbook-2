package Cars;

import LoopSwitches.WhileLoop;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.Scanner;

public class VehicleInfo {
    static Scanner scanner = new Scanner(System.in);
    //Create an array capable of holding up to 20 vehicles
    static Vehicle[] info = new Vehicle[20];
    //Preload the array with 6 vehicles
    static int count = 6;

    public static void main(String[] args) {
        //Preload the array with 6 vehicles part 2
        info[0] = new Vehicle(101121L, "Ford Explorer", "Red", 45000, 13500);
        info[1] = new Vehicle(101122L, "Toyota Camry", "Blue", 60000, 11000);
        info[2] = new Vehicle(101123L, "Chevrolet Malibu", "Black", 50000, 9700);
        info[3] = new Vehicle(101124L, "Honda Civic", "White", 70000, 7500);
        info[4] = new Vehicle(101125L, "Subaru Outback", "Green", 55000, 14500);
        info[5] = new Vehicle(101126L, "Jeep Wrangler", "Yellow", 30000, 16000);
        //Add a loop
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command: ");

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    searchByMakeModel();
                    break;
                case 3:
                    searchByPriceRange();
                    break;
                case 4:
                    searchByColor();
                    break;
                case 5:
                    addAVehicle();
                case 6:
                    System.out.println("Goodbye!");
                    return;

            }
        }


    }

    public static void listAllVehicles() {
        System.out.println("\nVehicle Inventory:");
        System.out.printf("%-8s %-20s %-10s %-10s %-10s%n",
                "ID", "Make/Model", "Color", "Odometer", "Price");
        for (int i = 0; i < count; i++) {
            info[i].display();
        }

    }

    public static void searchByMakeModel() {
        System.out.print("Enter make/model to search: ");
        String search = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if(info[i].getMakeModel().toLowerCase().contains(search)) {
                info[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles found matching that make/model.");
        }

    }

    public static void searchByPriceRange() {
        System.out.println("Enter minimum price: ");
        float min = scanner.nextFloat();
        System.out.println("Enter maximum price: ");
        float max = scanner.nextFloat();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (info[i].getPrice() >= min && info[i].getPrice() <= max) {
                info[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles found in that price range.");
        }
    }
    public static void searchByColor() {
        System.out.println("Enter color to search: ");
        String searchColor = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (info[i].getColor().toLowerCase().equals(searchColor)) {
                info[i].display();
                found = true;
            }


        }
        if (!found) {
            System.out.println("No vehicles found with that color.");
        }
    }
    public static void addAVehicle() {
        if (count >= info.length){
            System.out.println("Inventory full — cannot add more vehicles.");
            return;
        }
        System.out.print("Enter vehicle ID: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter make/model: ");
        String makeModel = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter odometer reading: ");
        int odometer = scanner.nextInt();

        System.out.print("Enter price: ");
        float price = scanner.nextFloat();

        info[count] = new Vehicle(id, makeModel, color, odometer, price);
        count++;

        System.out.println("Vehicle added successfully!");
    }
}

