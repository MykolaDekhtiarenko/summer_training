package com.mdekhtiarenko.services.validators;

/**
 * Created by mykola.dekhtiarenko on 28.07.17.
 */
public interface RegexpContainer {
    String FIRST_NAME = "^[a-zA-Z ]*$";
    String LAST_NAME = "^[a-zA-Z ]*$";
    String MIDDLE_NAME = "^[a-zA-Z ]*$";
    String NICKNAME = "^[a-zA-Z ]*$";
    String EMAIL = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
    String MOBILE_PHONE_NUMBER = "([\\+(]?(\\d){2,}[)]?[- \\.]?(\\d){2,}[- \\.]?(\\d){2,}[- \\.]?(\\d){2,}[- \\.]?(\\d){2,})|([\\+(]?(\\d){2,}[)]?[- \\.]?(\\d){2,}[- \\.]?(\\d){2,}[- \\.]?(\\d){2,})|([\\+(]?(\\d){2,}[)]?[- \\.]?(\\d){2,}[- \\.]?(\\d){2,})";
    String ADDITIONAL_PHONE_NUMBER = "([\\+(]?(\\d){2,}[)]?[- \\.]?(\\d){2,}[- \\.]?(\\d){2,}[- \\.]?(\\d){2,}[- \\.]?(\\d){2,})|([\\+(]?(\\d){2,}[)]?[- \\.]?(\\d){2,}[- \\.]?(\\d){2,}[- \\.]?(\\d){2,})|([\\+(]?(\\d){2,}[)]?[- \\.]?(\\d){2,}[- \\.]?(\\d){2,})";
    String LANDLINE_PHONE_NUMBER = "([\\+(]?(\\d){2,}[)]?[- \\.]?(\\d){2,}[- \\.]?(\\d){2,}[- \\.]?(\\d){2,}[- \\.]?(\\d){2,})|([\\+(]?(\\d){2,}[)]?[- \\.]?(\\d){2,}[- \\.]?(\\d){2,}[- \\.]?(\\d){2,})|([\\+(]?(\\d){2,}[)]?[- \\.]?(\\d){2,}[- \\.]?(\\d){2,})";
    String SKYPE = "^[a-zA-Z ]*$";
    String COMMENT = "^[_a-zA-Z0-9-]*$";
    String TOWN = "^[_a-zA-Z0-9-]*$";
    String STREET = "^[_a-zA-Z0-9-]*$";
    String BUILDING = "^[_a-zA-Z0-9-]*$";
    String POSTAL_CODE ="^[0-9][0-9][0-9][0-9][0-9]$";;




}