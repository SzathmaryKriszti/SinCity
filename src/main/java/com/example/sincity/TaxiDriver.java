package com.example.sincity;

public class TaxiDriver extends Citizen{

    private Taxi ownTaxi;
    public TaxiDriver(String name, int evilLevel, int amountOfMoney) {
        super(name, evilLevel, amountOfMoney);
    }

    public Taxi getOwnTaxi() {
        return ownTaxi;
    }

    public void setOwnTaxi(Taxi ownTaxi) {
        this.ownTaxi = ownTaxi;
    }
}
