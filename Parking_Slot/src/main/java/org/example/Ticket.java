package org.example;

import java.util.Date;

public class Ticket {
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot spot;

    public Ticket(Vehicle vehicle, ParkingSpot spot) {
        this.entryTime = new Date();
        this.vehicle = vehicle;
        this.spot = spot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public Date getEntryTime() {
        return entryTime;
    }
}
