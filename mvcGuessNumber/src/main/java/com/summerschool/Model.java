package com.summerschool;

import static java.lang.Math.random;

/**
 * Created by mykola.dekhtiarenko on 21.07.17.
 */
public class Model {

    private int number;
    private int attemptsCount;
    private int[] attempts;


    public Model() {
        this.number = (int)(random() * 100 + 1);
        this.attemptsCount = 0;
        this.attempts = new int[10];
    }

    public void addAtempt(int attempt){
        increaseArrayIfRequired();
        attempts[attemptsCount] = attempt;
        attemptsCount++;
    }

    public int getNumber() {
        return number;
    }

    public int[] getAttempts() {
        return attempts;
    }

    public int getAttemptsCount() {
        return attemptsCount;
    }

    private void increaseArrayIfRequired(){
        if(attemptsCount==attempts.length){
            int [] tmp = new int[(attempts.length/2)*3];
            for(int i=0; i<attempts.length; i++){
                tmp[i] = attempts[i];
            }
            attempts = tmp;
        }
    }

}
