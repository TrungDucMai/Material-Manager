package com.company;

import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, int cost, LocalDate manufacturingDate, double weight) {
        super(id, name, cost, manufacturingDate);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate() .plusDays(7);
    }

    @Override
    public String toString() {
        return super.toString()
                + "Meat{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public double getRealMoney() {
    LocalDate today = LocalDate.now();
    if(today.isBefore(getExpiryDate()) && today.isAfter(getExpiryDate().minusDays(3))){
        return getAmount()*0.5;
    } else if (today.isBefore(getExpiryDate().minusDays(3)) && today.isAfter((getExpiryDate().minusDays(5)))){
        return  getAmount()*0.7;
    }
    return 0;

    }
}
