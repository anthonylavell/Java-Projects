package udemy.advanced_alg.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawlBFS {
    private Queue<String> queue;
    private List<String> discoveredWebsiteList;
    public WebCrawlBFS(){
        queue = new LinkedList<>();
        discoveredWebsiteList = new ArrayList<>();
    }

    public void discoverWeb(String root){
        queue.add(root);
        discoveredWebsiteList.add(root);
        while (!queue.isEmpty()){
            String val = queue.remove();
            String rawHtml = readUrl(val);
            // Find valid urls (https://...)
            String regExp = "https://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regExp);
            Matcher matcher = pattern.matcher(rawHtml);

            while (matcher.find()){
                String str = matcher.group();
                if(!discoveredWebsiteList.contains(str)){
                    discoveredWebsiteList.add(str);
                    System.out.println("Website found: " + str);
                    queue.add(str);
                }
            }
        }
    }

    // read the HTML content of a given website (val)
    // and we return with a String format
    private String readUrl(String val){
        StringBuilder rawHtml = new StringBuilder("");
        try {
            URL url = new URL(val);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line = "";
            while ((line=reader.readLine()) != null){
                rawHtml.append(line);
            }

        } catch (Exception e){
            System.out.println("Problem while crawling the website .... ");
        }
        return rawHtml.toString();
    }
}
