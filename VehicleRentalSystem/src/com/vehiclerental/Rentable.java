package com.vehiclerental;

public interface Rentable {
    void rentVehicle(int days);
    void returnVehicle();
    double calculateRentalCost();
}
