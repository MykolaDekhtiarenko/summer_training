package com.mdekhtiarenko.flowers.entities.accessories;

import com.mdekhtiarenko.flowers.entities.enums.BasketSize;

/**
 * Created by mykola.dekhtiarenko on 27.07.17.
 */
public class Basket {
    private double price;
    private BasketSize size;

    public Basket(double price, BasketSize size) {
        this.price = price;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BasketSize getSize() {
        return size;
    }

    public void setSize(BasketSize size) {
        this.size = size;
    }
}
