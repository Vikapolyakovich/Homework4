package org.example;

import java.util.List;

public class TeacherGroup {
    private List<Teacher> teacherlist;
    private int id;

    public TeacherGroup(Integer id, List<Teacher> teacherlist) {
        this.teacherlist = teacherlist;
    }

    public TeacherGroup() {}

    public List<Teacher> getTeacherlist() {
        return teacherlist;
    }

    public void setTeacherlist(List<Teacher> teacherlist) {
        this.teacherlist = teacherlist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teacherlist=" + teacherlist +
                '}';
    }
}
