package org.example;

public abstract class ParkingSpot {
    private int id;
    private boolean isEmpty;
    private Vehicle vehicle;

    public ParkingSpot(int id) {
        this.id = id;
        this.isEmpty = true;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

    public abstract double getPrice();
}
