package FactoryMethod;

public class ShipFactory implements TransportFactory {
    @Override
    public Transport create() {
        return new Ship();
    }
}
