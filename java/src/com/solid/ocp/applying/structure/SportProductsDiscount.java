package com.solid.ocp.applying.structure;

public class SportProductsDiscount implements Discount {

    private static final double PRICE_WITH_DISCOUNT = 0.75;

    @Override
    public double calculate(double price) {
        return price * PRICE_WITH_DISCOUNT;
    }
}
