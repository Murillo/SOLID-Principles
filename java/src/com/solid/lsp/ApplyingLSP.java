package com.solid.lsp;

import com.solid.lsp.structure.Battery;
import com.solid.lsp.structure.Duck;
import com.solid.lsp.structure.MechanicalDuck;

import java.util.Optional;

public class ApplyingLSP {

    public static void run() {
        System.out.println("Applying Liskov Substitution Principle");
        Duck duck = new Duck();
        System.out.println(duck.walk());

        Battery battery = new Battery();
        MechanicalDuck mechanicalDuckExample1 = new MechanicalDuck(Optional.of(battery));
        System.out.println(mechanicalDuckExample1.walk());

        MechanicalDuck mechanicalDuckExample2 = new MechanicalDuck(Optional.empty());
        System.out.println(mechanicalDuckExample2.walk());

    }
}
