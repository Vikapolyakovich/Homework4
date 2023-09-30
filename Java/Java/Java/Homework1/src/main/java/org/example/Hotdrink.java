package src.main.java.org.example;

public class Hotdrink extends Beverages {
    int temp;

    public int getTemp() {
        return temp;
    }

    public Hotdrink(String name, int volume, int temp) {
        this.name = name;
        this.cost = volume;
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Product {" + name +
                " Vol = " + volume +
                " temp = " + temp +
                '}';
    }
}
