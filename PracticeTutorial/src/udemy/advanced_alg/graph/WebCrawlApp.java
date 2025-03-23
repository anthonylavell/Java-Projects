package udemy.advanced_alg.graph;

public class WebCrawlApp {
    public static void main(String[] args) {
        WebCrawlBFS bfs = new WebCrawlBFS();
        bfs.discoverWeb("https://www.bbc.com");
    }
}
