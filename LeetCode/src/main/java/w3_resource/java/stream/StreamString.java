package w3_resource.java.stream;

import java.util.Arrays;
import java.util.List;

public class StreamString {
    public static boolean findMatchStr(List<String>listOfStr,String keyWord){
        return listOfStr.stream().anyMatch(str ->str.contains(keyWord));
    }
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
        String keyWord = "API";
        System.out.println(findMatchStr(strings,keyWord));
    }
}
