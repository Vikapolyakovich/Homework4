package src.main.java.org.example;

import src.main.java.org.example.Hotdrink;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hotdrink hotdrink1 = new Hotdrink("Coffee", 1, 20);
        Hotdrink hotdrink2 = new Hotdrink("Soup", 2, 10);
        Hotdrink hotdrink3 = new Hotdrink("Water", 3, 50);
        HotDrinkAutomat hotDrinkAutomat1 = new HotDrinkAutomat();
        HotDrinkAutomat hotDrinkAutomat2 = new HotDrinkAutomat();
        HotDrinkAutomat hotDrinkAutomat3 = new HotDrinkAutomat();
        System.out.println(hotDrinkAutomat1.getProduct("Soup", 2, 10));

    }
}