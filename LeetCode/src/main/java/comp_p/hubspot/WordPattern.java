package comp_p.hubspot;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        //String str = "dog cat cat dog";
        String str = "dog cat cat fish";
        System.out.println(wordPattern(pattern,str));

    }

    public static boolean wordPattern(String pattern, String s) {
        Map<String,Character> words = new HashMap<>();
        Map<Character,String> letters = new HashMap<>();
        String [] strings = s.split(" ");
        if (pattern.length() != strings.length){
            return false;
        }
        int count = 0;

        for (char ch : pattern.toCharArray()){
            if (!words.containsKey(strings[count]) && !letters.containsKey(ch)){
                words.put(strings[count],ch);
                letters.put(ch,strings[count]);
            } else if ((words.get(strings[count]) == null || words.get(strings[count]) != ch)
                    || (letters.get(ch) == null || !letters.get(ch).equals(strings[count]))) {
                return false;
            }
            count++;
        }
        return true;
    }
}
