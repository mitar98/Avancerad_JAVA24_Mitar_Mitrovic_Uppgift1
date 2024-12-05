package com.vehiclerental;

public class Truck extends RentableVehicle {
    private double loadCapacity; // in tons

    public Truck(String model, String registrationNumber, double rentalPricePerDay, double loadCapacity) {
        super(model, registrationNumber, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Load Capacity: " + loadCapacity + " tons";
    }
}
