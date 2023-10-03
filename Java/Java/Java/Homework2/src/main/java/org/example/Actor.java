package org.example;

public abstract class Actor implements ActorBehavior{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }
}
