package w3_resource.java.stream;

import java.util.Comparator;
import java.util.List;

public class StreamSortStrings {
    public static List<String> sortListAsc(List<String>listOfStr){
        List<String>sortedList = listOfStr.stream().sorted().toList();
        return sortedList;
    }

    public static List<String> sortListDesc(List<String>listOfStr){
        List<String>sortedList = listOfStr.stream().sorted(Comparator.reverseOrder()).toList();
        return sortedList;
    }
    public static void main(String[] args) {
        List<String>listOfStr = List.of("Ward","Lavell","Anthony");
        System.out.println(sortListAsc(listOfStr));
        System.out.println(sortListDesc(listOfStr));
    }
}
