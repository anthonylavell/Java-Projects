package challenges.practice_challenge.coding_challenge;

import java.util.HashSet;
import java.util.Set;

public class CommonItems {
    public static void main(String[] args) {
        char [] array1 = {'a','b','c','x'};
        char [] array2 = {'z','y','x'};
        System.out.println(CommonItems.containItems(array1,array2) );
    }
    public static boolean containItems(char [] array1,char[] array2){
        Set<Character> hashSet = new HashSet<>();
        for(char ch: array1){
            hashSet.add(ch);
        }
        for(char ch: array2){
            if(hashSet.contains(ch))
                return true;
        }
        return false;
    }
}
