package com.example.sincity;

public class Passenger extends Citizen{

    private boolean hasGun;

    public Passenger(String name, int evilLevel, int amountOfMoney) {
        super(name, evilLevel, amountOfMoney);
    }

    public boolean hasGun() {
        return hasGun;
    }

    public void setGun(boolean hasGun) {
        this.hasGun = hasGun;
    }
}
