package org.example;

public class CalculatorView {

    public Complex add(Complex a, Complex b) {
        System.out.println("Выполняется сложение комплексных чисел");
        Complex result = a.add(b);
        System.out.println("Результат: " + result);
        return result;
    }

    public Complex mul(Complex a, Complex b) {
        System.out.println("Выполняется умножение комплексных чисел");
        Complex result = a.multiplication(b);
        System.out.println("Результат: " + result);
        return result;
    }

    public Complex divide(Complex a, Complex b) {
        System.out.println("Выполняется деление комплексных чисел");
        Complex result = a.divide(b);
        System.out.println("Результат: " + result);
        return result;
    }
}
