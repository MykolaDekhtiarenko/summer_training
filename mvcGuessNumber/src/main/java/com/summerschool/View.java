package com.summerschool;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by mykola.dekhtiarenko on 21.07.17.
 */
public class View {

    static String HELLO_MESSAGE = "Guess the number.";
    static String INT_INPUT = "Enter the number:";
    static String NUMBER_IS_BIGGER = "Number is bigger.";
    static String NUMBER_IS_SMALLER = "Number is smaller.";
    static String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please!";
    static String END_GAME = "YOU WIN!";
    static String NUMBER_OF_ATTEMPTS = "Number of attempts: ";
    static String LOG = "You tried: ";
    static String RANGE_BOUNDARIES = "Number is between ";
    static String OUT_OF_RANGE = "This number is out of range. Range is between ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printLog(String message, ArrayList<Integer> attempts){
        System.out.print(message);
        for(int i=0; i<attempts.size(); i++){
            System.out.print(" "+attempts.get(i));
        }
    }

    public void printRange(String message, int MAX_NUMBER, int MIN_NUMBER){
        System.out.println(message + MAX_NUMBER + " and "+MIN_NUMBER);
    }

}
