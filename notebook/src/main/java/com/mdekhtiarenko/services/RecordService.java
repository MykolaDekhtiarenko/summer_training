package com.mdekhtiarenko.services;

import com.mdekhtiarenko.entity.Address;
import com.mdekhtiarenko.entity.Notebook;
import com.mdekhtiarenko.entity.Record;
import com.mdekhtiarenko.entity.enums.Group;
import com.mdekhtiarenko.exeptions.NicknameAlreadyExists;
import com.mdekhtiarenko.services.validators.RecordValidator;
import com.mdekhtiarenko.views.View;

import java.util.Scanner;

/**
 * Created by mykola.dekhtiarenko on 28.07.17.
 */
public class RecordService {


    private RecordValidator validator;
    private Notebook notebook;
    private View view;

    public RecordService(Notebook notebook, View view) {
        this.notebook = notebook;
        this.view = view;
    }

    public void prossesUser(){
        Scanner scanner =  new Scanner(System.in);
        this.validator = new RecordValidator(scanner, view);

        view.printString(view.MENU);
        int choise = scanner.nextInt();
        while (choise == 1){
            Record record = createRecord(scanner);
            view.printString(record.toString());
            notebook.addRecord(record);
            view.printString(view.MENU);
            choise = scanner.nextInt();
        }
    }


    public void setNickname(Record record){
        String nickname = validator.inputStringValue(view.NICKNAME, validator.NICKNAME, view.WRONG_NICKNAME);
        try {
            record.setNickname(nickname, !notebook.contains(nickname));
        } catch (NicknameAlreadyExists nicknameAlreadyExists) {
//            nicknameAlreadyExists.printStackTrace();
            view.printWrongStringInput(view.WRONG_NICKNAME);
            setNickname(record);
        }
    }

    public Record createRecord(Scanner scanner){
        Record record = new Record();
        record.setFirstName(validator.inputStringValue(view.FIRST_NAME, validator.FIRST_NAME, view.WRONG_FIRST_NAME));
        record.setLastName(validator.inputStringValue(view.LAST_NAME, validator.LAST_NAME, view.WRONG_LAST_NAME));
        record.setMiddleName(validator.inputStringValue(view.MIDDLE_NAME, validator.MIDDLE_NAME, view.WRONG_MIDDLE_NAME));



        record.setMobilePhoneNumber(validator.inputStringValue(view.MOBILE_PHONE, validator.MOBILE_PHONE_NUMBER, view.WRONG_MOBILE_PHONE));
        record.setLandlinePhoneNumber(validator.inputStringValue(view.LANDLINE_PHONE, validator.LANDLINE_PHONE_NUMBER, view.WRONG_LANDLINE_PHONE));

        view.printString(view.ASK_ADDITIONAL_PHONE);
        String ask = scanner.next();

        if(ask.equals("y")||ask.equals("yes"))
            record.setAdditionalMobilePhoneNumber(validator.inputStringValue(view.ADDITIONAL_PHONE, validator.ADDITIONAL_PHONE_NUMBER, view.WRONG_ADDITIONAL_PHONE));

        view.printString(view.ASK_COMMENT);
        ask = scanner.next();
        if(ask.equals("y")||ask.equals("yes"))
            record.setComment(validator.inputStringValue(view.COMMENT, validator.COMMENT, view.WRONG_COMMENT));


        record.setEmail(validator.inputStringValue(view.EMAIL, validator.EMAIL, view.WRONG_EMAIL));
        record.setSkype(validator.inputStringValue(view.SKYPE, validator.SKYPE, view.WRONG_SKYPE));

        view.printString(view.ADDRESS);
        Address address = new Address();
        address.setTown(validator.inputStringValue(view.TOWN, validator.TOWN, view.WRONG_TOWN));
        address.setTown(validator.inputStringValue(view.STREET, validator.STREET, view.WRONG_STREET));
        address.setBuilding(validator.inputStringValue(view.BUILDING, validator.BUILDING, view.WRONG_BUILDING));
        address.setPostalCode(validator.inputStringValue(view.POSTAL_CODE, validator.POSTAL_CODE, view.WRONG_POSTAL_CODE));

        record.setAddress(address);

        view.printString(view.GROUP);
        view.printGroupEnum();
        String strGroup = scanner.next();
        Group group;
        if(strGroup.equals(""))
            group = Group.DEFAULT;
        else
            group = Group.valueOf(strGroup);

        setNickname(record);

        return record;
    }
}
