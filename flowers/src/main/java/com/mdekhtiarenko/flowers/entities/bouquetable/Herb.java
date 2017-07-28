package com.mdekhtiarenko.flowers.entities.bouquetable;

import com.mdekhtiarenko.flowers.entities.enums.HerbType;
import com.mdekhtiarenko.flowers.entities.Bouquetable;

/**
 * Created by mykola.dekhtiarenko on 27.07.17.
 */
public class Herb implements Bouquetable {

    private double price;
    private String name;
    private HerbType type;

    public Herb(double price, String name, HerbType type) {
        this.price = price;
        this.name = name;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HerbType getType() {
        return type;
    }

    public void setType(HerbType type) {
        this.type = type;
    }
}
