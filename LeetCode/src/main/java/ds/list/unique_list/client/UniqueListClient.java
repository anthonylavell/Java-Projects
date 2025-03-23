package ds.list.unique_list.client;

import ds.list.unique_list.UniqueList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueListClient {
    public static void main(String[] args) throws Exception {
        List<String> day1 = new ArrayList<>(Arrays.asList("14","15","16","20","22"));
        List<String> day2 = new ArrayList<>(Arrays.asList("14","21","22"));
        /*List<String> day1 = null;
        List<String> day2 = new ArrayList<>(Arrays.asList("14","21","22"));*/
       /* List<String> day1 = null;
        List<String> day2 = new ArrayList<>(Arrays.asList("14","21","22"));*/
        List<String> tempDays = new ArrayList<>(Arrays.asList("14","22","23"));
        boolean torf = tempDays.containsAll(UniqueList.modifyDay(day1,day2));
        System.out.println(torf);
        System.out.println(UniqueList.modifyDay(day1,day2));
    }
}
