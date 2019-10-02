package com.solid.lsp.structure;

import java.util.Optional;

public class MechanicalDuck extends Duck {

    private Optional<Battery> battery;

    public MechanicalDuck(Optional<Battery> battery){
        this.battery = battery;
    }

    @Override
    public String walk(){
        if (!battery.isPresent() || !battery.get().isCharge()){
            return "Error! It is not walking because of needing a battery... ";
        }
        return "Walking... ";
    }

}
