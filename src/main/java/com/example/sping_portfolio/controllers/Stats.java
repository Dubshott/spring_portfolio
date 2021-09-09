package com.example.sping_portfolio.controllers;

public class Stats {
    private String ties;
    private String dubs;
    private String losses;

    public String getTies() {
        return ties;
    }

    public void setTies(String newTies) {
        this.ties = newTies;
    }

    public String getDubs() {
        return dubs;
    }

    public void setDubs(String newDubs) {
        this.dubs = newDubs;
    }

    public String getLosses() {
        return losses;
    }

    public void setLosses(String newLosses) {
        this.losses = newLosses;
    }



    @Override
    public String toString() {
        return String.format(ties, dubs, losses);
    }

}
