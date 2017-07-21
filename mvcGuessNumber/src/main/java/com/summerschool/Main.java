package com.summerschool;

/**
 * Created by mykola.dekhtiarenko on 21.07.17.
 */
public class Main {

    public static void main(String [] args){
        Model m = new Model();
        View v = new View();
        Controller c = new Controller(m, v);

        c.game();
    }
}
