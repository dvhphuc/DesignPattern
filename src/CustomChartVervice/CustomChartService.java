package CustomChartVervice;

import CustomChartVervice.thirdparty.AdvancedChart;

public class CustomChartService implements IChartService {
    AdvancedChart advancedChart;

    public CustomChartService(AdvancedChart advancedChart) {
        this.advancedChart = advancedChart;
    }

    private String convertXMLToJson(XMLContent xmlContent) {
        return xmlContent.content.replace("XML", "JSON");
    }

    @Override
    public void showChart(XMLContent xmlContent) {
        String jsonContent = convertXMLToJson(xmlContent);
        advancedChart.showJsonChart(jsonContent);

    }
}
