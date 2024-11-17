package org.example;

public class TwoWheelerParkingSpot extends ParkingSpot {
    public TwoWheelerParkingSpot(int id) {
        super(id);
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
