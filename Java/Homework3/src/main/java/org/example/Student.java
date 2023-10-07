package org.example;

public class Student {
    protected String name;
    protected String surname;
    protected int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return  name + "  " +
                surname + " " +
                age + "\n";

    }
}
