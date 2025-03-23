package arraysandstrings.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Find the starting index of the repeat string with three character.
Examples:
abcabc; abc is the repeating str
index = 3
xabcabcabc abc is the repeating str
index = 4
bacxfgebbacabc
index = 8
 */
public class STR {
    public static int findIndex(String str){
        int index = -1;
        if(!str.trim().isBlank() && str.length()>5) {
            for(int count = 3; count < str.length(); count++){
                if(count >= str.length()-2){
                    break;
                }
                //int strIndex = indexOfStr(str.substring(0,count),str.charAt(count) );
                int strIndex = str.substring(0,count).indexOf(str.charAt(count));
                if(strIndex  >= 0){
                    char secondPos = str.charAt( strIndex+1 );
                    char thirdPos = str.charAt(strIndex+2 );
                    if(str.charAt(count+1) == secondPos && str.charAt(count+2) == thirdPos ){
                        index = count;
                        break;
                    }
                }
            }

        }

        return index;
    }

    /*private static int indexOfStr(String str, char ch){
        String temp = str;
        return str.indexOf(ch);
    }*/

    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.replaceAll("\\W", "#").toLowerCase().split("#");
        Map<String,Integer> mostCommondMap = new HashMap<>();
        int commonWord = 0;
        String tempStr = "";
        for(String word : words ){
            if(!word.equals("") && !Arrays.asList(banned).contains(word)){
                mostCommondMap.put(word, (mostCommondMap.get(word) != null) ? mostCommondMap.get(word)+1 : 1 );
                if(mostCommondMap.get(word) > commonWord){
                    commonWord = mostCommondMap.get(word);
                    tempStr = word;
                }
            }
        }
        System.out.println(mostCommondMap);
        System.out.println(tempStr);
        return tempStr;
    }

}
