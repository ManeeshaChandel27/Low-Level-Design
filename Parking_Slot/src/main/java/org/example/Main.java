package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Create Parking Spots
        List<ParkingSpot> twoWheelerSpots = Arrays.asList(new TwoWheelerParkingSpot(1), new TwoWheelerParkingSpot(2));
        List<ParkingSpot> fourWheelerSpots = Arrays.asList(new FourWheelerParkingSpot(1), new FourWheelerParkingSpot(2));

        // Create Managers
        TwoWheelerManager twoWheelerManager = new TwoWheelerManager(twoWheelerSpots);
        FourWheelerManager fourWheelerManager = new FourWheelerManager(fourWheelerSpots);

        // Park a Vehicle
        Vehicle bike = new Vehicle(1234, VehicleType.TWO_WHEELER);
        ParkingSpot spot = twoWheelerManager.findParkingSpace();
        if (spot != null) {
            twoWheelerManager.parkVehicle(bike, spot);
            System.out.println("Vehicle parked at spot ID: " + spot);
        }
    }
}