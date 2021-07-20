package com.company;
import java.time.LocalDate;
import java.time.LocalTime;


public abstract class Material implements Discount {
    private String id;
    private String name;
    private double cost;
    private LocalDate manufacturingDate;


    public Material() {
    }

    public Material(String id, String name, int cost, LocalDate manufacturingDate) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.manufacturingDate = manufacturingDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public abstract double getAmount();

    public abstract LocalDate getExpiryDate();

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }

}
