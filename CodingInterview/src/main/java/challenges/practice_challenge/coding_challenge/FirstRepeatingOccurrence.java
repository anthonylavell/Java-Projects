package challenges.practice_challenge.coding_challenge;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstRepeatingOccurrence {
    public static void main(String[] args) {
        //int [] arr = {2,5,1,2,3,5,1,2,4};
       //int [] arr = {2,1,1,2,3,5,1,2,4};
        int [] arr = {1,2,3,4,5};
        System.out.println(firstOccurrence(arr));
    }
    public static Integer firstOccurrence(int [] arr){
        Set<Integer> linkSet = new LinkedHashSet<>();
        Integer number = null;
        for(Integer num: arr){
            if(linkSet.contains(num)) {
                return num;
            }
            linkSet.add(num);
        }
        return number;
    }
}
