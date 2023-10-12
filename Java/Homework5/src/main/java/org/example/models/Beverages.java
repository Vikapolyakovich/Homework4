package org.example.models;

public abstract class Beverages {
    public String name;
    public int cost;

    public int volume;

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getVolume() {
        return volume;
    }
}
