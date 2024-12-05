package com.vehiclerental;

public class Car extends RentableVehicle {
    private int numberOfSeats;

    public Car(String model, String registrationNumber, double rentalPricePerDay, int numberOfSeats) {
        super(model, registrationNumber, rentalPricePerDay);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return super.toString() + ", Seats: " + numberOfSeats;
    }
}
