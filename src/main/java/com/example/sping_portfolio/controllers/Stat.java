package com.example.sping_portfolio.controllers;

public class Stat {
    private String powerlvl;
    private String health;
    private String weakness;


    public String getPowerlvl() {
        return powerlvl;
    }

    public void setPowerlvl(String newPowerlvl) {
        this.powerlvl = newPowerlvl;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String newHealth) {
        this.health = newHealth;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String newWeakness) {
        this.weakness = newWeakness;
    }


    @Override
    public String toString() {
        return String.format(powerlvl, health, weakness);
    }

}
