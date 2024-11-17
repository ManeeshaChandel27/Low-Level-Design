package org.example;

public abstract class CostComputation {
    protected PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double computePrice(Ticket ticket) {
        return pricingStrategy.calculatePrice(ticket);
    }
}
