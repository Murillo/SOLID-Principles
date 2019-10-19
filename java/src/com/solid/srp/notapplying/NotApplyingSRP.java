package com.solid.srp.notapplying;

import com.solid.srp.notapplying.structure.Shipment;

import java.time.LocalDateTime;

public class NotApplyingSRP {

    private static final Integer INVALID_SHIPMENT_QUANTITY = 0;
    private static final Long MINIMUM_WEIGHT = 10L;
    private static final Long MAX_WEIGHT = 1000L;

    /**
     * This method creates a new shipment instance and also checks if the shipment is valid.
     * This method has more than one responsibility, because it will create and validate
     * through three rules if the shipment is valid.
     */
    public void run(){
        // Without SRP
        System.out.println("Not applying SRP");
        Shipment shipment = Shipment.of(LocalDateTime.now().plusDays(-1), 10l, 100d);

        if (shipment.getWeight() < MINIMUM_WEIGHT || shipment.getWeight() > MAX_WEIGHT){
            System.out.println("This shipment has an invalid weight");
        } else if (!shipment.getQuantity().equals(INVALID_SHIPMENT_QUANTITY)) {
            System.out.println("This shipment must have at least one item.");
        } else if (shipment.getRequest().isAfter(LocalDateTime.now())) {
            System.out.println("This shipment is late.");
        } else {
            System.out.println("This shipment is valid.");
        }
    }

}
