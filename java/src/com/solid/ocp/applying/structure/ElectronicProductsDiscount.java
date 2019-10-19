package com.solid.ocp.applying.structure;

public class ElectronicProductsDiscount implements Discount {

    private static final double PRICE_MINIMUM_DISCOUNT = 5000;
    private static final double PRICE_MIN_DISCOUNT = 0.9;
    private static final double PRICE_MAX_DISCOUNT = 0.75;

    @Override
    public double calculate(double price) {
        if (price > PRICE_MINIMUM_DISCOUNT){
            return price * PRICE_MAX_DISCOUNT;
        }
        return price * PRICE_MIN_DISCOUNT;
    }
}
