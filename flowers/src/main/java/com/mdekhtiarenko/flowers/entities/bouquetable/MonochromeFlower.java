package com.mdekhtiarenko.flowers.entities.bouquetable;

import com.mdekhtiarenko.flowers.entities.enums.Color;
import com.mdekhtiarenko.flowers.entities.enums.Freshness;

/**
 * Created by mykola.dekhtiarenko on 26.07.17.
 */
public class MonochromeFlower extends Flower {

    Color color;


    public MonochromeFlower(double price, String name, Freshness freshnessLevel, Color color) {
        super(price, name, freshnessLevel);
        this.color=color;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MonochromeFlower{" +
                "color=" + color +
                '}';
    }
}
