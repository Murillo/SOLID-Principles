package com.solid.lsp.structure;

public class Battery {

    private float charge;

    public Battery(){
        charge = 100;
    }

    public float getCharge() {
        return charge;
    }

    public boolean isCharge(){
        return getCharge() > 0;
    }
}
