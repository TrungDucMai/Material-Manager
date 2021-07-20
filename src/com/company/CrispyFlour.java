package com.company;


import java.time.LocalDate;
import java.time.LocalTime;

public class CrispyFlour extends Material{
    private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, int cost, LocalDate localTime, double quantity) {
        super(id, name, cost, localTime);
        this.quantity = quantity;
    }

    public double getAmount() {
        return quantity * getCost();
    }


    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public String toString() {
        return super.toString()
                + "CrispyFlour{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public double getRealMoney() {
        LocalDate today = LocalDate.now();
        if ( today.isBefore(getExpiryDate()) && today.isAfter(getExpiryDate().minusMonths(2))){
            return getAmount()*0.6;
        }
         else if ( today.isBefore(getExpiryDate().minusMonths(2)) && today.isAfter(getExpiryDate().minusMonths(4))){
            return getAmount()*0.8;
        }
         else if ( today.isBefore(getExpiryDate().minusMonths(4)) && today.isAfter(getManufacturingDate())){
             return getAmount()*0.95;
        }
         return 0;

    }

//    @Override
//    public double getRealMoney() {
//        if (getExpiryDate().compareTo(LocalDate.now().plusMonths(4))==1){
//            setCost();

    }

