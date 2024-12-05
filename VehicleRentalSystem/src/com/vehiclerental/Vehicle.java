package com.vehiclerental;

public abstract class Vehicle {
    private String model;
    private String registrationNumber;
    private double rentalPricePerDay;

    public Vehicle(String model, String registrationNumber, double rentalPricePerDay) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    @Override
    public String toString() {
        return String.format("Model: %s, Registration: %s, Price per day: %.2f",
                model, registrationNumber, rentalPricePerDay);
    }
}
