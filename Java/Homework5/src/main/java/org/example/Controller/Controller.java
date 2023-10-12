package org.example.Controller;

import org.example.models.HotDrinkAutomat;
import org.example.models.Hotdrink;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public Hotdrink createHotdrink(String name, int value, int temp) {
        Hotdrink hotdrink = new Hotdrink(name, value, temp);
        hotdrink.setName(name);
        hotdrink.setVolume(value);
        hotdrink.setTemp(temp);
        return hotdrink;
    }

    public HotDrinkAutomat createHotDrinkAutomat() {
        HotDrinkAutomat hotDrinkAutomat = new HotDrinkAutomat();
        return hotDrinkAutomat;
    }

    public void addGroupAndCreateProduct(List<Hotdrink> group, String name, int value, int temp) {
        group.add(new Hotdrink(name, value, temp));
    }
    public void getProduct(HotDrinkAutomat hotDrinkAutomat, String name, int value, int temp) {
        System.out.println(hotDrinkAutomat.getProduct(name, value, temp));
    }

}