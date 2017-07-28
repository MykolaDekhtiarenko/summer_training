package com.mdekhtiarenko.flowers.entities.bouquetable;

import com.mdekhtiarenko.flowers.entities.enums.Color;
import com.mdekhtiarenko.flowers.entities.enums.Freshness;

import java.util.Set;

/**
 * Created by mykola.dekhtiarenko on 27.07.17.
 */
public class MulticolorFlower extends Flower {

    Set<Color> colorSet;


    public MulticolorFlower(double price, String name, Freshness freshnessLevel, Set<Color> colorSet) {
        super(price, name, freshnessLevel);
        this.colorSet=colorSet;
    }

    public void addColor(Color color){
        this.colorSet.add(color);
    }

    public void removeColor(Color color){
        this.colorSet.remove(color);
    }

    public Set<Color> getColorSet() {
        return colorSet;
    }

    public void setColorSet(Set<Color> colorSet) {
        this.colorSet = colorSet;
    }

    @Override
    public String toString() {
        return "MulticolorFlower{" +
                "colorSet=" + colorSet +
                '}';
    }
}
