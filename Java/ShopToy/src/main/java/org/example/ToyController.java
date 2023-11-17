package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ToyController implements ShopBehaviour {
    PriorityQueue<Toy> pq = new PriorityQueue<>(new ComparatorToy());
    List<Toy> toyList = new ArrayList<>();

    @Override
    public void addToy(Toy toy) {
        toyList.add(toy);
        System.out.println("Игрушка " + toy.getName() + " добавлена в магазин");
        pq.add(toy);
    }

    public void getToy() {
        try {
            FileWriter file = new FileWriter("data.txt");
            Date date = new Date();
            Toy toyWin = (Toy) pq.poll();
            file.write(date.toString() +"\n");
            file.write(toyWin.toString() + "\n");
            System.out.println("Разыграна " + toyWin.getName());
            toyList.remove(toyWin);
            file.close();
        } catch (IOException e) {}
    }

}
