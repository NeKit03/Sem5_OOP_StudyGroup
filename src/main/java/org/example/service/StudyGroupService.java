package org.example.service;

import org.example.model.Student;
import org.example.model.StudyGroup;
import org.example.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private List<StudyGroup> studyGroups = new ArrayList<>();
    private int idStudyGroups;
    public void create(Teacher teacher, List<Student> studentList){
        idStudyGroups=studyGroups.size();
        studyGroups.add(new StudyGroup(idStudyGroups,teacher,studentList));
    }

    public int getIdStudyGroups() {
        return idStudyGroups;
    }
    public List<Student> getListStudyGroup(Teacher teacher){
        for(StudyGroup studyGroup: studyGroups){
            if(studyGroup.getTeacher()==teacher){
                return studyGroup.getStudentList();
            }
        }
        return null;
    }
    public List<StudyGroup> getFullListStudyGroup(){
        return studyGroups;
    }

}
