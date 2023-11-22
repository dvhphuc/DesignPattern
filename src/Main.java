import FactoryMethod.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String type = new String("ship");
        TransportFactory transportFactory;

        if (type.equals("truck")) {
            transportFactory = new TruckFactory();
        }
        else if (type.equals("ship")) {
            transportFactory = new ShipFactory();
        }
        else {
            throw new RuntimeException("This type of transport is not supported");
        }

        Transport transport = transportFactory.create();
        transport.deliver();
    }
}