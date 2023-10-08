package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherView view = new TeacherView();
        List<Teacher> teachers = new ArrayList<>();

        view.addTeacherGroup(teachers,"0", "Викторовна", 26);
        view.addTeacherGroup(teachers,"Виктор", "Александрович", 51);
        view.addTeacherGroup(teachers, "Иван", "Семенов",  36);
        view.addTeacherGroup(teachers, "Николай", "Алексеевич", 42);

        view.printInfo(teachers);
        view.editTeacher(teachers, "Викторовна");
        view.printInfo(teachers);
    }
}