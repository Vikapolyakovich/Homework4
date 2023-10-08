package org.example;

public class Teacher {
//    private TeacherService validate = new TeacherService();
    protected String name;
    protected String surname;
    protected int age;

    public Teacher(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Teacher() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
//        validate.validateName(new Teacher(), name);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return  name + " " +
                surname + " " +
                age + "\n";

    }
}
