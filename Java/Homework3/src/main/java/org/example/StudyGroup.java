package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private List<Student> studentList = new ArrayList<>();
    private String name;

    public String getName() {
        return name;
    }

    public StudyGroup(String name) {
        this.name = name;
    }

    public void addstudent(Student student) {
        studentList.add(student);
    }
}
