/*
letters: a string of unique letters
Output
all of its distinct permutations

Examples
Example 1:
Input:

letters = abc
Output: abc acb bac bca cab cba
 */
package code.pattern.backtracking;

import java.util.*;
import java.util.stream.Collectors;

public class GeneralAllPermutations {
    public static void main(String[] args) {
        String letters = "abc";
        System.out.println(permutations(letters));
    }
    public static List<String> permutations(String letters) {
        // WRITE YOUR BRILLIANT CODE HERE
        List<String>perm = new ArrayList<>();
        Deque<Character> deque = new ArrayDeque<>();
        for(char ch : letters.toCharArray()){
            deque.add(ch);
        }
        getPermutations(letters,new ArrayList<>(),deque,perm);
        return perm;
    }

    private static void getPermutations(String letters,List<Character> usedList, Deque<Character> deque, List<String>perm){
        if(deque.isEmpty()){
            perm.add(usedList.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining()));
            return;
        }
        for(int i = usedList.size(); i < letters.length(); i++){
            usedList.add(deque.pop());
            getPermutations(letters,usedList,deque,perm);
            deque.add(usedList.get(usedList.size()-1));
            usedList.remove(usedList.size()-1);

        }
    }
}
