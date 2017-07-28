package com.mdekhtiarenko.flowers.entities.accessories;

/**
 * Created by mykola.dekhtiarenko on 27.07.17.
 */
public class Wrapper {

    private String name;
    private double price;

    public Wrapper(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
