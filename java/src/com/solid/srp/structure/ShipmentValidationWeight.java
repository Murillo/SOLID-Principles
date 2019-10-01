package com.solid.srp.structure;

public class ShipmentValidationWeight {

    private static final Long MINIMUM_WEIGHT = 10L;
    private static final Long MAX_WEIGHT = 1000L;

    public static String validation(Shipment shipment) {
        if (shipment.getWeight() < MINIMUM_WEIGHT || shipment.getWeight() > MAX_WEIGHT){
            return "The shipment has an invalid weight";
        }
        return "The shipment has a valid weight";
    }

}
