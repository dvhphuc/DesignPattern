package CustomChartVervice;

public class SimpleChart implements IChartService {
    @Override
    public void showChart(XMLContent xmlContent) {
        System.out.println("Showing chart with XML content: " + xmlContent);
    }
}
