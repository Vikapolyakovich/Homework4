package org.example;

import java.util.ArrayList;
import java.util.List;

public class TeacherView {
    private List<Teacher> teachergroup = new ArrayList<>();
    TeacherController teacherController = new TeacherController();
//    public void createTeacher(String name, String surname, int age) {
//        teacherController.createTeacher(name, surname, age);
//    }

    public void addTeacherGroup(List<Teacher> teachergroup, String name, String surname, int age) {
        teacherController.addTeacherGroup(teachergroup, name, surname, age);
    }

    public void printInfo(List<Teacher> teachers){
        teacherController.printTeacherGroup(teachers);
    }

    public void editTeacher(List<Teacher> teachers, String surname) {
        teacherController.editTeacher(teachers, surname);
    }

}
