package com.mdekhtiarenko.flowers.entities;

import com.mdekhtiarenko.flowers.entities.accessories.Basket;
import com.mdekhtiarenko.flowers.entities.accessories.Ribbon;
import com.mdekhtiarenko.flowers.entities.accessories.Wrapper;
import com.mdekhtiarenko.flowers.entities.enums.BouquetStalks;
import com.mdekhtiarenko.flowers.entities.enums.BouquetPurpose;
import com.mdekhtiarenko.flowers.entities.enums.BouquetSize;
import com.mdekhtiarenko.flowers.entities.enums.BouquetStatus;

import java.util.ArrayList;

/**
 * Created by mykola.dekhtiarenko on 27.07.17.
 */
public class Bouquet {
    public static double CHEAP_BOUQUET = 500;
    public static double BUDGET_BOUQUET = 1000;
    public static double EXPENCIVE_BOUQUET = 3000;

    public static int SMALL_BOUQUET = 15;
    public static int MEDIUM_BOUQUET = 30;
    public static int LARGE_BOUQUET = 100;

    private ArrayList<Bouquetable> flowersAndHerbs;
    private Basket basket;
    private Ribbon ribbon;
    private Wrapper wrapper;
    private BouquetPurpose bouquetPurpose;
    private BouquetStalks bouquetStalks;

    private BouquetSize size;
    private BouquetStatus status;

    public Bouquet(ArrayList<Bouquetable> flowersAndHerbs, Basket basket, Ribbon ribbon, Wrapper wrapper, BouquetPurpose bouquetPurpose, BouquetStalks bouquetStalks) {
        this.flowersAndHerbs = flowersAndHerbs;
        this.basket = basket;
        this.ribbon = ribbon;
        this.wrapper = wrapper;
        this.bouquetPurpose = bouquetPurpose;
        this.bouquetStalks = bouquetStalks;

        this.size = this.getSize();
        this.status = this.getStatus();

    }

    public ArrayList<Bouquetable> getFlowersAndHerbs() {
        return flowersAndHerbs;
    }

    public void setFlowersAndHerbs(ArrayList<Bouquetable> flowersAndHerbs) {
        this.flowersAndHerbs = flowersAndHerbs;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Ribbon getRibbon() {
        return ribbon;
    }

    public void setRibbon(Ribbon ribbon) {
        this.ribbon = ribbon;
    }

    public Wrapper getWrapper() {
        return wrapper;
    }

    public void setWrapper(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

    public BouquetPurpose getBouquetPurpose() {
        return bouquetPurpose;
    }

    public void setBouquetPurpose(BouquetPurpose bouquetPurpose) {
        this.bouquetPurpose = bouquetPurpose;
    }

    public BouquetStalks getBouquetStalks() {
        return bouquetStalks;
    }

    public void setBouquetStalks(BouquetStalks bouquetStalks) {
        this.bouquetStalks = bouquetStalks;
    }


    private BouquetStatus getStatus(){
        double price = 0;
        for(int i=0; i<flowersAndHerbs.size(); i++){
            price += flowersAndHerbs.get(i).getPrice();
        }
        if(price < CHEAP_BOUQUET)
            return BouquetStatus.CHEAP;
        else if(price < BUDGET_BOUQUET)
            return BouquetStatus.BUDGET;
        else if(price < EXPENCIVE_BOUQUET)
            return BouquetStatus.EXPENCIVE;
        else return BouquetStatus.VIP;
    }

    private BouquetSize getSize(){
        if(flowersAndHerbs.size() < SMALL_BOUQUET)
            return BouquetSize.SMALL;
        else if(flowersAndHerbs.size() < MEDIUM_BOUQUET)
            return BouquetSize.MEDIUM;
        else if(flowersAndHerbs.size() < LARGE_BOUQUET)
            return BouquetSize.LARGE;
        else return BouquetSize.EXTRA_LARGE;
    }
}
