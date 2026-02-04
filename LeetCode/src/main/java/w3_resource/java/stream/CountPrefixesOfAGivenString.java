package w3_resource.java.stream;

import java.util.Arrays;

public class CountPrefixesOfAGivenString {
    public int countPrefixes(String[] words, String s) {
       return (int) Arrays.stream(words).filter(s::startsWith).count();
    }
    public static void main(String[] args) {
        CountPrefixesOfAGivenString count = new CountPrefixesOfAGivenString();
        String [] words = {"a","a"};
        String s = "aa";
        System.out.println(count.countPrefixes(words,s));
    }
}
