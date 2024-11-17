package org.example;

public class FourWheelerCostComputation extends CostComputation {
    public FourWheelerCostComputation() {
        super(new MinutePricingStrategy());
    }
}
