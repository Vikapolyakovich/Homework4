package org.example.View;

import org.example.Controller.Controller;
import org.example.models.HotDrinkAutomat;
import org.example.models.Hotdrink;

import java.util.List;

public class View {
    Controller controller = new Controller();

    public void addGroupAndCreateProduct(List<Hotdrink> group, String name, int value, int temp) {
        controller.addGroupAndCreateProduct(group, name, value, temp);
    }

    public void createGroupAutomat() {
        controller.createHotDrinkAutomat();
    }
    public void getProduct(HotDrinkAutomat hotDrinkAutomat, String name, int value, int temp) {
        controller.getProduct(hotDrinkAutomat, name, value, temp);
    }


}
