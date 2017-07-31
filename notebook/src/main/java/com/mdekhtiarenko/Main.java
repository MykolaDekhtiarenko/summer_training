package com.mdekhtiarenko;

import com.mdekhtiarenko.entity.Notebook;
import com.mdekhtiarenko.entity.Record;
import com.mdekhtiarenko.services.RecordService;
import com.mdekhtiarenko.views.View;

/**
 * Created by mykola.dekhtiarenko on 28.07.17.
 */
public class Main {
    public static void main(String args []){
        RecordService service = new RecordService(new Notebook(), new View());
        service.prossesUser();
    }
}
