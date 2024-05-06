package com.example.sincity;

public abstract class Citizen {

    private String name;
    private int evilLevel;
    private int amountOfMoney;

    public Citizen(String name, int evilLevel, int amountOfMoney) {
        this.name = name;
        if (evilLevel < 1 || evilLevel > 5) {
            this.evilLevel = 3;
        } else {
            this.evilLevel = evilLevel;
        }
        this.amountOfMoney = amountOfMoney;
    }

    public String getName() {
        return name;
    }

    public int getEvilLevel() {
        return evilLevel;
    }

    public void setEvilLevel(int evilLevel) {
        this.evilLevel = evilLevel;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
}
