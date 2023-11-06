package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
public class User {
    private String surname;
    private String name;
    private String patronymic;
    private Date dateofbirth;
    private long number;
    private String gender;

    public User() {}

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDateofbirth(Date dateofbirth) {

        this.dateofbirth = dateofbirth;

    }



    public void setNumber(long number) {
        this.number = number;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public long getNumber() {
        return number;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        String strDate = format.format(dateofbirth);

        return  surname + " " +
                name + " " +
                patronymic  + " " +
                strDate + " " +
                number + " " +
                gender;
    }
}
