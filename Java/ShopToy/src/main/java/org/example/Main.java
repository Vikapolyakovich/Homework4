package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ToyController toyController = new ToyController();
        toyController.addToy(new Toy(1, "кукла", 5));
        toyController.addToy(new Toy(4, "сова", 1));
        toyController.addToy(new Toy(2, "шар", 0));
        toyController.addToy(new Toy(2, "мышь", 9));
        toyController.addToy(new Toy(3, "машинка", 6));
        toyController.addToy(new Toy(2, "мяч", 3));

        toyController.getToy();
    }
}