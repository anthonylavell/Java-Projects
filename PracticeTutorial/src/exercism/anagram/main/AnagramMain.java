package exercism.anagram.main;

import exercism.anagram.Anagram;

import java.util.List;

public class AnagramMain {
    public static void main(String[] args) {
        List listOfStr = List.of("enlists","google","inlets","banana");
        String target = "listen";
        String anagram = Anagram.findAnagram(listOfStr,target);
        System.out.println("anagram = " + anagram);

    }
}
