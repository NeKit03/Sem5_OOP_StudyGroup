package org.example.model;

import org.example.model.User;

import javax.swing.*;

public class Teacher extends User {
    private int teacherId;

    public Teacher(int teacherId,String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;


    }

    public int getTeacherId() {
        return teacherId;
    }


    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }





    @Override
    public String toString() {
        return "teacherId = " + teacherId +" "+
                super.toString()+
                '}';
    }
}
