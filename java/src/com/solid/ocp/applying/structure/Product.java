package com.solid.ocp.applying.structure;

public final class Product {

    private final String name;
    private final Double price;
    private final ProductType type;

    private Product(String name, Double price, ProductType type){
        this.price = price;
        this.type = type;
        this.name = name;
    }

    public Double getPrice() {
        return getType().priceWithDiscount(price);
    }

    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return String.format("Product: %s; Price: %.2f", getName(), getPrice());
    }

    public static Product of(String name, Double price, ProductType type){
        return new Product(name, price, type);
    }
}
