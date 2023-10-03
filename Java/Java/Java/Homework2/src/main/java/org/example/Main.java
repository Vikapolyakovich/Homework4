package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Actor> actors = new ArrayList<Actor>();
        Market market = new Market(actors);
        Human name = new Human();
        name.setName("Aleks");
        Human name1 = new Human();
        name1.setName("Kate");
        market.acceptToMarket(name);
        market.acceptToMarket(name1);
        market.takeInQueue(name);
        market.takeInQueue(name1);
        market.update();
        market.releaseFromMarket(name);
        market.update();
    }
}