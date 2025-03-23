package exercism.isogram;

import java.util.HashSet;
import java.util.Set;

public class IsogramChecker {
   public static boolean isIsogram(String phrase) {
       if(phrase.length() > 1){
           Set<Character>setOfChar = new HashSet<>();
           for(char ch : phrase.toCharArray()){
               if(setOfChar.contains(ch)){
                   return false;
               }
               setOfChar.add(ch);
           }
       }
        return true;
    }

}
