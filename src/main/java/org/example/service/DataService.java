package org.example.service;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;
import org.example.model.Type;
import java.util.ArrayList;
import java.util.List;

public class DataService  {
    private List<User> users=new ArrayList<>();


    public void create(String firstName,String secondName, String lastName,Type type){
        int id=getFreeId(type);
        if(type==Type.STUDENT){
            users.add(new Student(id,firstName,secondName,lastName));

        }else{
            if(type==Type.TEACHER){
                users.add(new Teacher(id,firstName,secondName,lastName));
            }
        }
    }
    private int getFreeId(Type type){
        boolean isStudent= (type==Type.STUDENT);
        int lastId=1;
        for(User user:users){
            if(user instanceof Student && isStudent){
                lastId=((Student) user).getStudentId()+1;
            }else{
                if(user instanceof Teacher && !isStudent) {
                    lastId = ((Teacher) user).getTeacherId() + 1;
                }
            }
        }
        return lastId;


    }
    public List<Student>getStudents(){
        List<Student> stdentsList =new ArrayList<>();
        for(User user:users){
            if(user instanceof Student){
                stdentsList.add((Student)user);
            }
        }
        return stdentsList;
    }
    public List<Teacher>getTeachers(){
        List<Teacher> teacherList =new ArrayList<>();
        for(User user:users){
            if(user instanceof Teacher){
                teacherList.add((Teacher)user);
            }
        }
        return teacherList;
    }
}
