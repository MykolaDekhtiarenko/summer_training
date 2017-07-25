package com.summerschool;

import java.util.Scanner;

/**
 * Created by mykola.dekhtiarenko on 21.07.17.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void game(){

        Scanner sc = new Scanner(System.in);

        view.printMessage(view.HELLO_MESSAGE);
        view.printRange(view.RANGE_BOUNDARIES, model.getMIN_NUMBER(), model.getMAX_NUMBER());

        int number = getNumberFromUser(sc, model);
        model.addAtempt(number);

        while (number != model.getNumber()){
            if (number  > model.getNumber()){
                view.printMessage(view.NUMBER_IS_SMALLER);
            }
            else if (model.getNumber() > number){
                view.printMessage(view.NUMBER_IS_BIGGER);
            }
            view.printRange(view.RANGE_BOUNDARIES, model.getMIN_NUMBER(), model.getMAX_NUMBER());

            number = inputIntValueWithScanner(sc);
            model.addAtempt(number);
        }

        endGame();
    }


    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INT_INPUT);
        while( ! sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA +"\n"+view.INT_INPUT);
            sc.next();
        }
        return sc.nextInt();
    }

    public boolean rangeCheck(int number, Model model){
        if(model.getMIN_NUMBER()<number&&number<model.getMAX_NUMBER())
            return true;
        else return false;
    }

    public int getNumberFromUser(Scanner sc, Model model){
        int number = inputIntValueWithScanner(sc);
        while (!rangeCheck(number, model)){
            view.printRange(view.OUT_OF_RANGE, model.getMIN_NUMBER(), model.getMAX_NUMBER());
            number = inputIntValueWithScanner(sc);
        }
        return number;
    }





    private void endGame(){
        view.printMessage(view.END_GAME);
        view.printMessage(view.NUMBER_OF_ATTEMPTS+model.getAttemptsCount());
        view.printLog(view.LOG, model.getAttempts());
    }

}
