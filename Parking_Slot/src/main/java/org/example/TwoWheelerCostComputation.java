package org.example;

public class TwoWheelerCostComputation extends CostComputation {
    public TwoWheelerCostComputation() {
        super(new HourlyPricingStrategy());
    }
}
