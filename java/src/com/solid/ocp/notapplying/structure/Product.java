package com.solid.ocp.notapplying.structure;

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
        return price;
    }

    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static Product of(String name, Double price, ProductType type){
        return new Product(name, price, type);
    }
}
