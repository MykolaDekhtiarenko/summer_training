package com.summerschool;

/**
 * Created by mykola.dekhtiarenko on 21.07.17.
 */
public class View {

    static String HELLO_MESSAGE = "Guess the number. Number is beetwen 0 and 100.";
    static String INT_INPUT = "Enter the number:";
    static String NUMBER_IS_BIGGER = "Number is bigger.";
    static String NUMBER_IS_SMALLER = "Number is smaller.";
    static String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please!";
    static String END_GAME = "YOU WIN!";
    static String NUMBER_OF_ATTEMPTS = "Number of attempts: ";
    static String LOG = "You tried: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printLog(String message, int[] attempts, int amount){
        System.out.print(message);
        for(int i=0; i<amount; i++){
            System.out.print(" "+attempts[i]);
        }
    }



}
