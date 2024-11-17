package org.example;

public class FourWheelerParkingSpot extends ParkingSpot {
    public FourWheelerParkingSpot(int id) {
        super(id);
    }

    @Override
    public double getPrice() {
        return 20.0;
    }
}
