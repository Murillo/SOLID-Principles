package com.solid.ocp.applying.structure;

public interface Discount {

    /**
     * This method is used to calculate the product discount by type of product.
     * In this routine, the OCP principle will be applied because each product type class
     * will implement the Discount interface and override this method, applying a specific
     * discount calculation
     * @param price This is parameter that represents the product price
     * @return double This returns the price with discount as a double.
     */
    double calculate(double price);
}
