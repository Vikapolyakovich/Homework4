package src.main.java.org.example;

public class HotDrinkAutomat implements Automat{

    @Override
    public String getProduct(String name, int volume, int temperature) {
        return "Product {" + name +
                " volume = " + volume +
                " temperature = " + temperature +
                "}";
    }

}
