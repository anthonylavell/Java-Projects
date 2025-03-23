package practice.string;

import java.util.ArrayList;
import java.util.List;

public class Fizz {
    public static List<String> fizzBuzz(int n) {
        List<String> listOfStr = new ArrayList<>();
        for(int i =1; i <= n; i++){
            if((i%3==0) && (i%5==0)){
                listOfStr.add("FizzBuzz");
            }else if(i%5==0){
                listOfStr.add("Buzz");
            }else if(i%3==0){
                listOfStr.add("Fizz");
            }else {
                listOfStr.add(String.valueOf(i));
            }
        }
        return listOfStr;
    }
}
