package com.vehiclerental;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalApp {
    public static void main(String[] args) {
        ArrayList<RentableVehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota Corolla", "ABC123", 500, 5));
        vehicles.add(new SUV("Land Rover", "DEF456", 800, true));
        vehicles.add(new Truck("Volvo FH16", "GHI789", 1000, 18));
        vehicles.add(new Convertible("Mazda MX-5", "JKL012", 700, true));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Vehicle Rental System ===");
            System.out.println("1. View Vehicles\n2. Rent a Vehicle\n3. Return a Vehicle\n4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Vehicles:");
                    for (int i = 0; i < vehicles.size(); i++) {
                        RentableVehicle vehicle = vehicles.get(i);
                        System.out.println((i + 1) + ". " + vehicle);
                    }
                    break;
                case 2:
                    System.out.println("Enter vehicle number to rent:");
                    int rentIndex = scanner.nextInt() - 1;
                    if (rentIndex >= 0 && rentIndex < vehicles.size()) {
                        if (vehicles.get(rentIndex).isRented()) {
                            System.out.println("This vehicle is already rented.");
                        } else {
                            System.out.println("Enter number of days to rent:");
                            int days = scanner.nextInt();
                            vehicles.get(rentIndex).rentVehicle(days);
                            System.out.println("Vehicle rented! Total cost: " +
                                    vehicles.get(rentIndex).calculateRentalCost());
                        }
                    } else {
                        System.out.println("Invalid vehicle number.");
                    }
                    break;
                case 3:
                    System.out.println("Enter vehicle number to return:");
                    int returnIndex = scanner.nextInt() - 1;
                    if (returnIndex >= 0 && returnIndex < vehicles.size()) {
                        if (vehicles.get(returnIndex).isRented()) {
                            vehicles.get(returnIndex).returnVehicle();
                            System.out.println("Vehicle returned successfully!");
                        } else {
                            System.out.println("This vehicle is not rented.");
                        }
                    } else {
                        System.out.println("Invalid vehicle number.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
