package array;

import java.util.HashSet;
import java.util.Set;

public class RecurringCharacter {
    public static int first(int [] intArray){
        Set<Integer> tempNum = new HashSet<>(){};
        for(int num : intArray){
            if(tempNum.contains(num)){
                return num;
            }
            tempNum.add(num);
        }
        return -1;
    }
}
