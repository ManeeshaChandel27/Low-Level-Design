package org.example;

import java.util.List;

public class NearToEntrance implements ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots) {
        return parkingSpots.stream().filter(ParkingSpot::isEmpty).findFirst().orElse(null);
    }
}
