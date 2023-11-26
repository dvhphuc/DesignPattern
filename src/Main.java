import CustomChartVervice.CustomChartService;
import CustomChartVervice.IChartService;
import CustomChartVervice.SimpleChart;
import CustomChartVervice.XMLContent;
import CustomChartVervice.thirdparty.AdvancedChart;
import Builder.Person;
import Builder.PersonBuilder;
import FactoryMethod.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //factoryMethod();
        //builder();
        //singleton();
        //adapter();
    }

    private static void adapter() {
        XMLContent xmlContent = new XMLContent("<xml>...</xml>");

        IChartService chartService = new SimpleChart();
        chartService.showChart(xmlContent);

        AdvancedChart advancedChart = new AdvancedChart();
        IChartService adapter = new CustomChartService(advancedChart);
        adapter.showChart(xmlContent);
    }

    private static void factoryMethod() {
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

    private static void builder() {
        PersonBuilder pb = new PersonBuilder();
        Person p = pb.name("John").age(20).address("123 London Road").build();
    }
}