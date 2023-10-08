package org.example;

import java.util.Scanner;

public class TeacherService{

    Scanner in = new Scanner(System.in);

    public void validateName(Teacher teacher, String name) {
        String answer;
        while (name.length() <=1) {
            System.out.println("Имя "+ name+ " слишком короткое. Введите корректное значение: ");
            answer = in.next();
            name = answer;
        }
        teacher.setName(name);
    }

    public void validateSurname(Teacher teacher, String surname) {
        String answer;
        while (surname.length() <=1) {
            System.out.println("Фамилия "+ surname+ " слишком короткая. Введите корректное значение: ");
            answer = in.next();
            surname = answer;
        }
        teacher.setSurname(surname);
    }

    public void validateAge(Teacher teacher, Integer age) {
        Integer answer;
        while (age <= 1) {
            System.out.println("Возраст "+ age+ " не может быть меньше 1. Введите корректное значение: ");
            answer = in.nextInt();
            age = answer;
        }
        teacher.setAge(age);
    }



}

