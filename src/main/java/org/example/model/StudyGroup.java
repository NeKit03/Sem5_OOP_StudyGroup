package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup{
    private int studyGroupID;
    private Teacher teacher;
    private  List<Student> studentList = new ArrayList<>();
    public StudyGroup(int studyGroupID, Teacher teacher, List<Student> studentList) {
            this.studyGroupID=studyGroupID;
            this.teacher=teacher;
            this.studentList=studentList;
    }

    public int getStudyGroupID() {
        return studyGroupID;
    }

    public void setStudyGroupID(int studyGroupID) {
        this.studyGroupID = studyGroupID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "studyGroupID=" + studyGroupID +"\n"+
                 teacher.toString() +"\n"+
                studentList.toString();
                //", studentList=" + studentList;
    }
}
