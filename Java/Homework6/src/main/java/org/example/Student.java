package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Student {  //должен быть public и наследоваться от класса User - абстракного.
    // Принцип открытости закрытости - должен расширять класс User
    // Принцип инверсионной зависимости - должен зависеть от абстракного класса User
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class User {    //abstract
    String name; // поля сделать protected , чтобы наследовать их в классе Student
    String surname;
    String patronymic;

    public User(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return  name + ' ' +
                surname + ' ' +
                patronymic + ' ';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

}

class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSurname().compareTo(o2.getSurname());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getName().compareTo(o2.getName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}

class StudentGroup<T extends User> {  //public class and extends Student

    private String nameGroup;
    private List<T> group;

    public StudentGroup(String nameGroup, List<T> group) {
        this.nameGroup = nameGroup;
        this.group = group;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public List<T> getGroup() {
        return group;
    }

    public void addStudent(T user) { // принцип единой отствественности. Можно вынести в отдельный класс контроллер.
        // И сделать класс view для отображения
        group.add(user);
    }

    public void removeStudent(T user) {  // принцип единой отствественности. Можно вынести в отдельный класс контроллер.
        // И сделать класс view для отображения
        group.remove(user);
    }
}


