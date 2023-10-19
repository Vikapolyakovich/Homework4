package org.example;

public class Complex {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex b) {
        double realres = this.real + b.getReal();
        double imaginaryres = this.imaginary + b.getImaginary();
        return new Complex(realres, imaginaryres);
    }

    //метод для деления комплексных чисел
    public Complex divide(Complex b) {
        double newReal = (this.real* b.getReal() + this.imaginary*b.getImaginary())/(b.getReal()* b.getReal() + b.getImaginary()*b.getImaginary());
        double newImage = (this.real*b.getReal() - this.real*b.getImaginary())/(b.getReal()* b.getReal() + b.getImaginary()* b.getImaginary());
        return new Complex(newReal, newImage);
    }


    //метод для умножения комплексных чисел
    public Complex multiplication(Complex b) {
        double newReal = this.real*b.getReal() - this.imaginary*b.getImaginary();
        double newImage = this.imaginary*b.getReal() + this.real*b.getImaginary();
        return new Complex(newReal, newImage);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + "+" + imaginary + "i";
        }
        else {
            return real + "-" + Math.abs(imaginary) + "i";
        }
    }
}
