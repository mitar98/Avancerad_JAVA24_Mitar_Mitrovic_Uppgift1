package com.vehiclerental;

public class SUV extends RentableVehicle {
    private boolean hasFourWheelDrive;

    public SUV(String model, String registrationNumber, double rentalPricePerDay, boolean hasFourWheelDrive) {
        super(model, registrationNumber, rentalPricePerDay);
        this.hasFourWheelDrive = hasFourWheelDrive;
    }

    public boolean hasFourWheelDrive() {
        return hasFourWheelDrive;
    }

    @Override
    public String toString() {
        return super.toString() + ", 4WD: " + hasFourWheelDrive;
    }
}