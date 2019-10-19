package com.solid.ocp.notapplying;

import com.solid.ocp.notapplying.structure.DiscountProduct;
import com.solid.ocp.notapplying.structure.Product;
import com.solid.ocp.notapplying.structure.ProductType;

public class NotApplyingOCP {

    public void Run(){
        // Calculating the discount without Open/Close Principle
        Product product = Product.of("Tablet", 1000d, ProductType.ELECTRONIC);
        DiscountProduct discountProduct = new DiscountProduct();
        discountProduct.calculate(product.getPrice(), product.getType());
    }

}
