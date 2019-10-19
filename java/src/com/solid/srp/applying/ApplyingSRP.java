package com.solid.srp.applying;

import com.solid.srp.applying.structure.Shipment;
import com.solid.srp.applying.structure.ShipmentValidationWeight;

import java.time.LocalDateTime;

public class ApplyingSRP {

    public static void run() {
        // With SRP
        System.out.println("Applying SRP");
        Shipment shipment = Shipment.of(LocalDateTime.now(), 10l, 100d);
        System.out.println(ShipmentValidationWeight.validation(shipment));
    }
}
