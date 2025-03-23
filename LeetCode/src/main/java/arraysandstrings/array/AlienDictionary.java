package arraysandstrings.array;

import java.util.*;

public class AlienDictionary {
    public static void main(String[] args) {
        //String [] words = {"wrt","wrf","er","ett","rftt"};
        //String [] words = {"zab","ab"};
        //String [] words = {"zab","zab"};
        //String [] words = {"z","x","z"};
        //String [] words = {"z","x"};
        String [] words = {"ac","ab","zc","zb"};
        alienOrder(words);
    }
    public static String alienOrder(String[] words) {
        String word = "";
        Queue<Character>queue = new LinkedList<>();
        char [] inDegree = new char[26];
        Map<Character, Set<Character>> map = new HashMap<>();
        for(String str : words){
            setMap(map,str.toCharArray());
        }
        for(int i = 1; i < words.length; i++){
            char[] secondChar = words[i].toCharArray();
            char[] firstChar = words[i-1].toCharArray();
            int len = Math.min(firstChar.length, secondChar.length);
            if(firstChar.length > secondChar.length && words[i-1].startsWith(words[i])){
                return "";
            }
            for (int index = 0; index < len; index++){
                if((index < secondChar.length) && firstChar[index] != secondChar[index]){
                    if(map.get(firstChar[index]).add(secondChar[index])){
                        inDegree[(secondChar[index]-'a')]++;
                    }
                    break;
                }
            }
        }
        for(char ch : map.keySet()){
            if(inDegree[ch-'a'] < 1){
                queue.add(ch);
            }
        }

        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                char letter = queue.poll();
                word+=letter;
                for(Character ch : map.get(letter) ){
                    if(--inDegree[ch-'a'] < 1){
                        queue.add(ch);
                    }
                }
            }
        }
        int i = 0;
        return word.length() == map.size() ? word : "";
    }
    private static void setMap(Map<Character, Set<Character>> map, char[] letters){
        for(char ch : letters){
            if(!map.containsKey(ch)){
                map.put(ch,new HashSet<>());
            }
        }
    }
}
