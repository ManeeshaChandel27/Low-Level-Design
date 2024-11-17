package org.example;

import java.util.List;

public abstract class ParkingSpotManager {
    protected List<ParkingSpot> parkingSpots;
    protected ParkingStrategy parkingStrategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
        this.parkingSpots = parkingSpots;
        this.parkingStrategy = parkingStrategy;
    }

    public ParkingSpot findParkingSpace() {
        return parkingStrategy.findParkingSpot(parkingSpots);
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    public void removeParkingSpot(ParkingSpot spot) {
        parkingSpots.remove(spot);
    }

    public void parkVehicle(Vehicle vehicle, ParkingSpot spot) {
        spot.parkVehicle(vehicle);
    }

    public void removeVehicle(ParkingSpot spot) {
        spot.removeVehicle();
    }
}
