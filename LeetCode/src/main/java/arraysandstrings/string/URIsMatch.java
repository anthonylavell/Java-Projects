package arraysandstrings.string;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


public class URIsMatch {
    public static boolean matchURI (String line){
       /*String str1 = ;
        String str2 = ;*/
       /* boolean startNewLine = false;
        for(char ch : line.toCharArray()){
            if(ch == ';'){
                startNewLine = true;
                continue;
            }
            if(startNewLine){
                str2 = (str2+ch);
                //str2= str2.toLowerCase();
            }else {
                str1 = (str1+ch);
            }
        }*/

       // System.out.println(str1);
       // System.out.println(str2);

        /*for(int count = 0; count < str1.length(); count++){
            char ch1 = str1.charAt(count);
            char ch2 = str2.charAt(count);
            if(str1.charAt(count) != str2.charAt(count)){
                break;
            }
        }*/

        URI uri =  null;
        URI uri2 = null;
        URL url =  null;
        URL url2 = null;
        try {
             uri = new URI("http://abc.com:80/~smith/home.html");
             uri2 = new URI("http://abc.com/%7Esmith/home.html");
             String str = uri.toASCIIString();
             String str2 = uri2.toASCIIString();
            System.out.println(str+ "   hel");
            System.out.println(str2+ "   hel2");
           /* System.out.println("URI      : " + uri);
            System.out.println("URI2      : " + uri2);
            System.out.println(uri.compareTo(uri2));*/

            uri = new URI(str);
            uri2 = new URI(str2);

        } catch (URISyntaxException use) {


        }

        /*try {
            url = uri.toURL();
            System.out.println("URL from URI: " + url);

            url2 = uri2.toURL();
            System.out.println("URL from URI: " + url2);
            System.out.println(url.equals(url2));
        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }*/
        return true;
    }
}
