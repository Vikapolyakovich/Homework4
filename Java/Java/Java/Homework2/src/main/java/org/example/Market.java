package org.example;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Deque;

public class Market implements MarketBehaviour, QueueBehaviour{
    Deque<Actor> que = new ArrayDeque<>();
    List<Actor> actors;

    public Market(List<Actor> actors) {
        this.actors = actors;
    }


    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("Новый посетитель в магазине " + actor.getName());
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);
        System.out.println(actor.getName()+" ушел с магазина");
    }

    @Override
    public void update() {
        giveOrders();
        takeOrders();
    }

    @Override
    public void takeInQueue(Actor actor) {
        que.addLast(actor);
        System.out.println("В очередь добавлен: " + actor.getName());
    }

    @Override
    public void takeOrders() {
        System.out.println("Заказ выдан");
    }

    @Override
    public void giveOrders() {
        System.out.println("Заказ создан");
        releaseFromQueue();
    }


    @Override
    public void releaseFromQueue() {
        que.removeFirst();
        System.out.println("Удален из очереди. Текущая очередь: ");
        getQueue(que);
    }

    public void getQueue(Deque<Actor> que) {
        for(Actor p : que){
            System.out.println(p.getName());
        }
    }
}
