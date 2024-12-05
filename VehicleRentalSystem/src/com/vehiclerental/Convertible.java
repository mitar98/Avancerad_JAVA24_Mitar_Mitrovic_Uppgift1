package com.vehiclerental;

public class Convertible extends RentableVehicle {
    private boolean hasRetractableRoof;

    public Convertible(String model, String registrationNumber, double rentalPricePerDay, boolean hasRetractableRoof) {
        super(model, registrationNumber, rentalPricePerDay);
        this.hasRetractableRoof = hasRetractableRoof;
    }

    public boolean hasRetractableRoof() {
        return hasRetractableRoof;
    }

    @Override
    public String toString() {
        return super.toString() + ", Retractable Roof: " + (hasRetractableRoof ? "Yes" : "No");
    }
}
