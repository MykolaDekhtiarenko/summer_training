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
//        System.out.println("Cheat: "+model.getNumber());
        Scanner sc = new Scanner(System.in);

        view.printMessage(view.HELLO_MESSAGE);

        int number = inputIntValueWithScanner(sc);
        model.addAtempt(number);

        while (number != model.getNumber()){
            if (number  > model.getNumber()){
                view.printMessage(view.NUMBER_IS_SMALLER);
            }
            else if (model.getNumber() > number){
                view.printMessage(view.NUMBER_IS_BIGGER);
            }
            number = inputIntValueWithScanner(sc);
            model.addAtempt(number);
        }

        endGame();
    }


    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INT_INPUT);
        while( ! sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INT_INPUT);
            sc.next();
        }
        return sc.nextInt();
    }



    private void endGame(){
        view.printMessage(view.END_GAME);
        view.printMessage(view.NUMBER_OF_ATTEMPTS+model.getAttemptsCount());
        view.printLog(view.LOG, model.getAttempts(), model.getAttemptsCount());
    }

}
