package org.example.controller;
import org.example.model.Student;
import org.example.model.StudyGroup;
import org.example.model.Teacher;
import org.example.model.Type;
import org.example.service.DataService;
import org.example.service.StudyGroupService;
import org.example.view.StudentView;
import org.example.view.StudyGroupView;

import java.util.List;

public class Controller  {
    private final DataService service=new DataService();
    private final StudentView view =new StudentView();

    private final StudyGroupService serviseStudyGroup=new StudyGroupService();
    private final StudyGroupView viewStudyGroup=new StudyGroupView();

    public void createStudyGroup(Teacher teacher, List<Student> studentList){
        serviseStudyGroup.create(teacher,studentList);
    }
    public void createStudent(String firstName,String secondName, String lastName){
            service.create(firstName,secondName,lastName,Type.STUDENT);

    }
    public void createTeacher(String firstName,String secondName, String lastName){
            service.create(firstName,secondName,lastName,Type.TEACHER);

    }
    public void printsStudents(){
        for(Student student: service.getStudents()){
            view.printConsole(student);
        }
    }
    public void printStudyGroup(){
        for(StudyGroup studyGroup: serviseStudyGroup.getFullListStudyGroup()){
            viewStudyGroup.printConsole(studyGroup);
        }
    }
    public void printTeacherStudyGroup(Teacher teacher) {
       for(Student student: serviseStudyGroup.getListStudyGroup(teacher)){
           view.printConsole(student);
       }
    }

    public void printsTeachers(){
        for(Teacher teacher: service.getTeachers()){
            view.printConsole(teacher);
        }
    }
    public Teacher getTeacher(int id){
       return service.getTeachers().get(id);
    }
    public List<Student> getListStudent(){
        return service.getStudents();
    }
}
