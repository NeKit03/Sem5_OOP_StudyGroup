package org.example;

import org.example.controller.Controller;
import org.example.model.Teacher;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Nikita", "12312", "12321");
        controller.createStudent("Nikita1", "12312", "12321");
        controller.createStudent("Nikita2", "12312", "12321");
        controller.createTeacher("Asdasd", "asdasd", "asd");
        controller.createTeacher("Asdasd1", "asdasd1", "asd1");
        controller.createTeacher("Asdasd2", "asdasd2", "asd2");
        controller.printsTeachers();
        controller.printsStudents();
        controller.createStudyGroup(controller.getTeacher(0),controller.getListStudent());
        controller.printStudyGroup();
        controller.printTeacherStudyGroup(controller.getTeacher(0));

    }
}