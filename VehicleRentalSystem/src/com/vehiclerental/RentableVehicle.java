package com.vehiclerental;

public abstract class RentableVehicle extends Vehicle implements Rentable {
    private boolean isRented;
    private int rentalDays;

    public RentableVehicle(String model, String registrationNumber, double rentalPricePerDay) {
        super(model, registrationNumber, rentalPricePerDay);
        this.isRented = false;
        this.rentalDays = 0;
    }

    @Override
    public void rentVehicle(int days) {
        if (!isRented) {
            isRented = true;
            rentalDays = days;
        } else {
            System.out.println("Vehicle is already rented.");
        }
    }

    @Override
    public void returnVehicle() {
        if (isRented) {
            isRented = false;
            rentalDays = 0;
        } else {
            System.out.println("Vehicle is not currently rented.");
        }
    }

    @Override
    public double calculateRentalCost() {
        return rentalDays * getRentalPricePerDay();
    }

    public boolean isRented() {
        return isRented;
    }
}
