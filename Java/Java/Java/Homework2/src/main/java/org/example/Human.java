package org.example;

public class Human extends Actor{
    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
        System.out.println("Заказ создан");
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
        System.out.println("Заказ выдан");
    }

}
