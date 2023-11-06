package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserService {
    Scanner in = new Scanner(System.in);

    public String validateName(String name) {
        if (name.length() <= 1) {
            System.out.println("Имя "+ name+ " слишком короткое. Введите корректное значение: ");
            validateName(in.next());
        }
        if (name.length() >= 50) {
            System.out.println("Имя "+ name+ " слишком длинное. Введите корректное значение: ");
            validateName(in.next());
        }
        else {
            return name;
        }
        return null;
    }

    public String validateSurname(String surname) {
        if (surname.length() <= 1) {
            System.out.println("Фамилия "+ surname+ " слишком короткая. Введите корректное значение: ");
            validateSurname(in.nextLine());
        }
        if (surname.length() >= 50) {
            System.out.println("Фамилия "+ surname+ " слишком длинная. Введите корректное значение: ");
            validateSurname(in.nextLine());
        }
        else {
            return surname;
        }
        return null;
    }

    public String validatePatronymic(String patronymic) {
        if (patronymic.length() <= 1) {
            System.out.println("Отчество "+ patronymic+ " слишком короткое. Введите корректное значение: ");
            validatePatronymic(in.next());
        }
        if (patronymic.length() >= 50) {
            System.out.println("Отчество "+ patronymic+ " слишком длинное. Введите корректное значение: ");
            validatePatronymic(in.next());
        }
        else {
            return patronymic;
        }
        return null;
    }

    public Date validateDateBirth(String datebirth) {
        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        try {
            Date date = format.parse(datebirth);
            return date;
        } catch (ParseException e) {
            System.out.println("Неверная дата. Введите дату в формате: dd.mm.yyyy");
            String strdate = in.nextLine();
            validateDateBirth(strdate);
        }
        return null;
    }

    public Long validateNumberPhone(String number) {
        try {
            if (number.length() == 11) {
                return Long.parseLong(number);
            }
            else {
                System.out.println("Длина номера должна быть 11. Попробуйте еще раз: ");
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("Не удалось преобразовать в число. Попробуйте еще раз: ");
        }
        return validateNumberPhone(in.nextLine());
    }

    public String validateGender(String gender) {
        if (gender.equals("f") || gender.equals("m")) {
            return gender;
        } else {
            System.out.println("Неверный символ. Введите символ f или m");
        }
        return validateGender(in.nextLine());
    }

}
