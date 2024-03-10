package org.example.model;

import org.example.model.User;

public class Student extends User {
    private int studentId;


    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "studentId=" + studentId +" "+
                super.toString()+ "\n";
    }

}