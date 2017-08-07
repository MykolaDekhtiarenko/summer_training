package com.mdekhtiarenko.services.validators;

import com.mdekhtiarenko.entity.Record;
import com.mdekhtiarenko.views.View;

import java.util.Scanner;

/**
 * Created by mykola.dekhtiarenko on 28.07.17.
 */
public class RecordValidator implements RegexpContainer{

    Scanner scanner;
    View view;

    public RecordValidator(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String inputStringValue(String message, String regexp){
        String res;
        view.printString(message);
        while (! (scanner.hasNext() && (res = scanner.next()).matches(regexp))){
            view.printWrongStringInput(message);
        }
        return res;
    }

    public String inputStringValue(String message, String regexp, String errorMessage){
        String res;
        view.printString(message);
        while (! (scanner.hasNext() && (res = scanner.next()).matches(regexp))){
            view.printWrongStringInput(errorMessage+"\n"+message);
        }
        return res;
    }
}
