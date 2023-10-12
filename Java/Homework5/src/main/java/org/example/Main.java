package org.example;


import org.example.View.View;
import org.example.models.HotDrinkAutomat;
import org.example.models.Hotdrink;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        List<Hotdrink> group = new ArrayList<>();
        view.addGroupAndCreateProduct(group,"Coffee", 1, 20);
        view.addGroupAndCreateProduct(group,"Soup", 2, 10);
        view.addGroupAndCreateProduct(group,"Water", 3, 50);
        view.createGroupAutomat();
        HotDrinkAutomat hotDrinkAutomat = new HotDrinkAutomat();
        view.getProduct(hotDrinkAutomat,"Soup", 2, 10);


    }
}