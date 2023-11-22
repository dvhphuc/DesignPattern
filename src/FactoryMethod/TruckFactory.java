package FactoryMethod;

public class TruckFactory implements TransportFactory{

    @Override
    public Transport create() {
        return new Truck();
    }
}
