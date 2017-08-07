package com.mdekhtiarenko.entity;

import com.mdekhtiarenko.exeptions.NicknameAlreadyExists;

import java.util.ArrayList;

/**
 * Created by mykola.dekhtiarenko on 28.07.17.
 */
public class Notebook {
    private ArrayList<Record> notebook;

    public Notebook() {
        notebook = new ArrayList<Record>();
    }

    public ArrayList<Record> getNotebook() {
        return notebook;
    }

    public void setNotebook(ArrayList<Record> notebook) {
        this.notebook = notebook;
    }

    public void addRecord(Record record) {
      notebook.add(record);
    }

    public boolean contains(String nickname){
        for (Record record : notebook){
            if(record.getNickname().equalsIgnoreCase(nickname))
                return true;
        }
        return false;
    }
}
