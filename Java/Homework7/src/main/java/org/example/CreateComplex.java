package org.example;

import java.util.Scanner;

public class CreateComplex {


    public Complex create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите действительное число: ");
        double real = sc.nextDouble();
        System.out.println("Введите мнимое число: ");
        double emage = sc.nextDouble();
        return new Complex(real, emage);
    }
}
