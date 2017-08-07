package com.mdekhtiarenko.views;

import com.mdekhtiarenko.entity.enums.Group;

/**
 * Created by mykola.dekhtiarenko on 28.07.17.
 */
public class View {

    public static final String MENU = "Press 1 to add new record to the notebook or press 0 to exit:";
    public static final String FIRST_NAME = "Enter your first name: ";
    public static final String WRONG_FIRST_NAME = "Your name contains invalid characters. Please enter it onece again.";

    public static final String LAST_NAME = "Enter your last name: ";
    public static final String WRONG_LAST_NAME = "Your last name contains invalid characters. Please enter it onece again.";

    public static final String MIDDLE_NAME = "Enter your middle name: ";
    public static final String WRONG_MIDDLE_NAME = "Your middle name contains invalid characters. Please enter it onece again.";

    public static final String EMAIL = "Enter your email address: ";
    public static final String WRONG_EMAIL = "Given email address is wrong or contains invalid characters. Please enter it onece again.";

    public static final String MOBILE_PHONE = "Enter your mobile phone number: ";
    public static final String WRONG_MOBILE_PHONE = "Given mobile phone contains invalid characters or does not match the pattern. Right patterns are: \n" +
            "###-###-#### \n" +
            "#-###-###-#### \n " +
            "########## \n" +
            "+### ##-###-#### \n" +
            " ###.###.#### \n" +
            "### ### #### \n" +
            "(###)### #### \n";

    public static final String LANDLINE_PHONE = "Enter your landline phone number: ";
    public static final String WRONG_LANDLINE_PHONE = "Given landline phone contains invalid characters or does not match the pattern. Right patterns are: \n" +
            "###-###-#### \n" +
            "#-###-###-#### \n " +
            "########## \n" +
            "+### ##-###-#### \n" +
            " ###.###.#### \n" +
            "### ### #### \n" +
            "(###)### #### \n";

    public static final String ADDITIONAL_PHONE = "Enter your additional phone number: ";
    public static final String ASK_ADDITIONAL_PHONE = "Do you want to add additional phone to this record? Print \"y\" or \"yes\" if you want to, otherwise print \"no\"..";
    public static final String WRONG_ADDITIONAL_PHONE = "Given additional phone contains invalid characters or does not match the pattern. Right patterns are: \n" +
            "###-###-#### \n" +
            "#-###-###-#### \n " +
            "########## \n" +
            "+### ##-###-#### \n" +
            " ###.###.#### \n" +
            "### ### #### \n" +
            "(###)### #### \n";

    public static final String SKYPE = "Enter your skype login: ";
    public static final String WRONG_SKYPE = "Given skype login seems to be invalid.";

    public static final String NICKNAME = "Create nickname: ";
    public static final String WRONG_NICKNAME = "Your nickname is invalid.";
    public static final String EXISTING_NICKNAME = "User with such nickname already exists! Enter another one:";

    public static final String COMMENT = "Comment: ";
    public static final String ASK_COMMENT = "Do you want to add comment to ths record? Print \"y\" or \"yes\" if you want to, otherwise print \"no\".";
    public static final String WRONG_COMMENT = "Coment contains inappropriate characters.";

    public static final String ADDRESS = "Give us information about your address.";

    public static final String TOWN = "Town: ";
    public static final String WRONG_TOWN = "Given information contains inappropriate characters.";

    public static final String STREET = "Street: ";
    public static final String WRONG_STREET = "Given information contains inappropriate characters.";

    public static final String BUILDING = "Building: ";
    public static final String WRONG_BUILDING = "Given information contains inappropriate characters.";

    public static final String POSTAL_CODE = "Postal code: ";
    public static final String WRONG_POSTAL_CODE = "Given postal code seems to be invalid.";

    public static final String GROUP = "Which group does this record belong to?";




    public void printString(String message){
        System.out.println(message);
    }

    public void printWrongStringInput(String message){
        System.out.println(message);
    }

    public void printGroupEnum(){
        for(Group g: Group.values()){
            printString(g.name());
        }
    }

}
