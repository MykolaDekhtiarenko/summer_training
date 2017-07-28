package com.mdekhtiarenko.flowers.entities.bouquetable;

import com.mdekhtiarenko.flowers.entities.enums.Freshness;
import com.mdekhtiarenko.flowers.entities.Bouquetable;

/**
 * Created by mykola.dekhtiarenko on 26.07.17.
 */
public class Flower implements Bouquetable {
    private double price;
    private String name;
    private Freshness freshnessLevel;



    public Flower(double price, String name, Freshness freshnessLevel) {
        this.price = price;
        this.name = name;
        this.freshnessLevel = freshnessLevel;
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

    public Freshness getFreshnessLevel() {
        return freshnessLevel;
    }

    public void setFreshnessLevel(Freshness freshnessLevel) {
        this.freshnessLevel = freshnessLevel;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", freshnessLevel=" + freshnessLevel +
                '}';
    }
}
