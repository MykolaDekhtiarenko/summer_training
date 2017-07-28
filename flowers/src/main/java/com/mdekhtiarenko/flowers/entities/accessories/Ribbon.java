package com.mdekhtiarenko.flowers.entities.accessories;

import com.mdekhtiarenko.flowers.entities.enums.RibbonForm;

/**
 * Created by mykola.dekhtiarenko on 27.07.17.
 */
public class Ribbon {
    private double price;
    private int length;
    private RibbonForm form;

    public Ribbon(double price, int length, RibbonForm form) {
        this.price = price;
        this.length = length;
        this.form = form;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public RibbonForm getForm() {
        return form;
    }

    public void setForm(RibbonForm form) {
        this.form = form;
    }
}
