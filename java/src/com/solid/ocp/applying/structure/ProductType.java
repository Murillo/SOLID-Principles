package com.solid.ocp.applying.structure;

public enum ProductType {
    ELECTRONIC {
        public double priceWithDiscount(double price){
            Discount discount = new ElectronicProductsDiscount();
            return discount.calculate(price);
        };
    },
    SPORT{
        public double priceWithDiscount(double price){
            Discount discount = new SportProductsDiscount();
            return discount.calculate(price);
        };
    };

    public abstract double priceWithDiscount(double price);
}
