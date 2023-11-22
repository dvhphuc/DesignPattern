package FactoryMethod;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by sea in a container");
    }
}