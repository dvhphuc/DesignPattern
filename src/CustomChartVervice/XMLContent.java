package CustomChartVervice;

public class XMLContent {
    String content;

    public XMLContent(String content) {
        this.content = content;
    }

    public String toString() {
        return String.format("Content: %s", content);
    }
}
