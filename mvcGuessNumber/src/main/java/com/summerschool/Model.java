package com.summerschool;

import java.util.ArrayList;

import static java.lang.Math.random;

/**
 * Created by mykola.dekhtiarenko on 21.07.17.
 */
public class Model {

    private int MAX_NUMBER = 99;
    private int MIN_NUMBER = 1;
    private int number;
    private ArrayList<Integer> attempts;


    public Model() {
        this.number = (int) (random() * MAX_NUMBER);
        this.attempts = new ArrayList();
    }


    public void addAtempt(int attempt) {
        attempts.add(attempt);
        updateBoundaries(attempt);
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Integer> getAttempts() {
        return attempts;
    }

    public int getAttemptsCount() {
        return attempts.size();
    }

    public int getMAX_NUMBER() {
        return MAX_NUMBER;
    }

    public int getMIN_NUMBER() {
        return MIN_NUMBER;
    }

    private void updateBoundaries(int attempt) {
        if (MIN_NUMBER < attempt && attempt < MAX_NUMBER) {
            if (MIN_NUMBER < attempt && attempt < number) {
                MIN_NUMBER = attempt;
            } else if (number < attempt && attempt < MAX_NUMBER) {
                MAX_NUMBER = attempt;
            } else {
                //Situation when player wins
            }
        }
        else{
            //Situation when input is out of the boundaries
            //Check it in controller
        }

    }
}
