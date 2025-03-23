package practice.test;

import practice.array.Anagrams;

public class TestAnagrams {
    public static void main(String[] args){
        String [] strs = {"ward","ant","eat", "tea", "tan", "ate", "nat", "bat","draw"};
        char [] ch = strs[0].toCharArray();
        System.out.println(Anagrams.groupAnagrams(strs));
    }
}
