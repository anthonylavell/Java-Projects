package exercism.anagram;

import java.util.Arrays;
import java.util.List;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class Anagram {
    public static String findAnagram(List<String> listOfStr, String target){
        String result = "";
        Function<String,String> reverseWord = ((input) -> {
            char [] tempStr=input.toCharArray();
            Arrays.sort(tempStr);
            return String.valueOf(tempStr);

        });

        BiPredicate<String,String> isAnagram = ( (tempTarget, str2) ->  reverseWord.apply(str2).equalsIgnoreCase(tempTarget)
        );

        String reverseTarget = reverseWord.apply(target);

       for(String str : listOfStr){
           if(isAnagram.test(reverseTarget,str)){
               result = str;
               break;
           }
       }
        return result;
    }
}
