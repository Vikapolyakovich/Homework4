package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        view.add(new CreateComplex().create(), new CreateComplex().create());
        view.mul(new CreateComplex().create(), new CreateComplex().create());
        view.divide(new CreateComplex().create(), new CreateComplex().create());
    }
}