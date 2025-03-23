package ds.list.unique_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueList {
    public static List<String>days(List<String> day1, List<String> day2) throws Exception{
        if((day1 == null || day2 == null) || (day1.isEmpty() || day2.isEmpty())){
            throw new RuntimeException("Please provide data for both days" );
        }
        Set<String> uniqueDays = new HashSet<>();
        for(String day: day1){
            if(day2.contains(day)){
                uniqueDays.add(day);
            }
        }
        return new ArrayList<String>(uniqueDays);
    }
    //If I could redo my approach
    public static List<String>modifyDay(List day1, List day2){
        if((day1 == null || day2 == null) || (day1.isEmpty() || day2.isEmpty())){
            throw new RuntimeException("Please provide data for both days" );
        }
        day1.retainAll(day2);
        return day1;
    }
}
