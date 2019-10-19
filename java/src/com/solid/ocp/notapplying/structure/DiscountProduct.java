package com.solid.ocp.notapplying.structure;

public class DiscountProduct {

    private static final double ELECTRONIC_PRICE_MINIMUM_DISCOUNT = 5000;
    private static final double ELECTRONIC_PRICE_MIN_DISCOUNT = 0.9;
    private static final double ELECTRONIC_PRICE_MAX_DISCOUNT = 0.75;
    private static final double SPORT_PRICE_WITH_DISCOUNT = 0.75;

    /**
     * This method is used to calculate the product discount by type of product.
     * In this routine, the OCP principle is not being applied and there is one
     * condition by type.
     * @param price This is parameter that represents the product price
     * @param productType  This is the second parameter that represents the product type
     * @return double This returns the price with discount as a double.
     */
    public double calculate(double price, ProductType productType){
        double priceWithDiscount = price;
        if (productType.equals(ProductType.ELECTRONIC)) {
            if (price > ELECTRONIC_PRICE_MINIMUM_DISCOUNT) {
                priceWithDiscount = price * ELECTRONIC_PRICE_MAX_DISCOUNT;
            } else {
                priceWithDiscount = price * ELECTRONIC_PRICE_MIN_DISCOUNT;
            }
        } else if (productType.equals(ProductType.SPORT)) {
            priceWithDiscount = price * SPORT_PRICE_WITH_DISCOUNT;
        }
        return priceWithDiscount;
    }

}
