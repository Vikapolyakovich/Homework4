package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherController{
    private TeacherService validate = new TeacherService();
    private Scanner in = new Scanner(System.in);
    private static List<TeacherGroup> stream = new ArrayList<>();

    public Teacher createTeacher(String name, String surname, int age) {
        Teacher teacher = new Teacher();
        teacher.setName(name);
        validate.validateName(teacher, name);
        teacher.setSurname(surname);
        validate.validateSurname(teacher, surname);
        teacher.setAge(age);
        validate.validateAge(teacher, age);
        return teacher;
    }

    public static Teacher serchSurname(List<Teacher> teachers, String surname){
        for (Teacher teacher: teachers) {
            if (teacher.getSurname().equals(surname)) {
                return teacher;
            }
        }
        System.out.println("Фамилии не найдено");
        return null;
    }

    public void editTeacher(List<Teacher> teachers, String surname) {
        Teacher res = serchSurname(teachers, surname);

        int answer;
        System.out.println("Что вы хотите изменить? 1 - Имя, 2 - Фамилию, 3 - возвраст ");
        if (in.nextInt() == 1){
            System.out.println("Введите имя: ");
            validate.validateName(res, in.next());
        }
        if (in.nextInt() == 2) {
            System.out.println("Введите фамилию: ");
            validate.validateSurname(res, in.next());
        }
        if (in.nextInt() == 3) {
            System.out.println("Введите возраст: ");
            validate.validateAge(res, in.nextInt());
        }
    }

    public void printTeacherGroup(List<Teacher> teacherlist){
        for (Teacher el: teacherlist ) {
            System.out.println(el);
        }
    }
    public void addTeacherGroup(List teacherlist, String name, String surname, int age) {
        teacherlist.add(createTeacher(name, surname, age));
    }


}
