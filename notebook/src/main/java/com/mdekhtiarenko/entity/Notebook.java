package com.mdekhtiarenko.entity;

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

    public void addRecord(Record record){
//        if(notebook.)
        notebook.add(record);
    }
}
