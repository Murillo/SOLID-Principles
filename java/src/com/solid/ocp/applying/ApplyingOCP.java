package com.solid.ocp.applying;

import com.solid.ocp.applying.structure.Product;
import com.solid.ocp.applying.structure.ProductType;

public class ApplyingOCP {

    public static void run(){
        // With OCP
        System.out.println("Applying OCP");
        Product product1 = Product.of("Sneakers", 120d, ProductType.SPORT);
        Product product2 = Product.of("SuperBook Pro",10000d, ProductType.ELECTRONIC);
        System.out.println(product1.toString());
        System.out.println(product2.toString());
    }
}
