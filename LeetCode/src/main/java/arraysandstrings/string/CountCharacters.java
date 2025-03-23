package arraysandstrings.string;

import java.util.LinkedHashMap;

public class CountCharacters {
    static String CountLetters(String input) {
        String tempStr="";
        LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<>();
        for(int i = 0; i < input.length(); i++){
            if(!hashMap.containsKey(input.toLowerCase().charAt(i))){
                hashMap.put(input.toLowerCase().charAt(i),1);
                continue;
            }
            //hashMap.computeIfPresent(input.toLowerCase().charAt(i), (k, v) -> v + 1);
            hashMap.put(input.toLowerCase().charAt(i), hashMap.get(input.toLowerCase().charAt(i)) +1);

        }
        System.out.println(hashMap);
        for (Character name: hashMap.keySet()){
            tempStr= tempStr+","+"'"+name.toString()+"':"+hashMap.get(name).toString();
        }
        tempStr =tempStr.substring(1,tempStr.length());
        return tempStr;
    }
}
