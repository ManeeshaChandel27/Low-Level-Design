package org.example;

import java.util.Date;

public class HourlyPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(Ticket ticket) {
        long duration = (new Date().getTime() - ticket.getEntryTime().getTime()) / (1000 * 60 * 60);
        return duration * ticket.getSpot().getPrice();
    }
}
