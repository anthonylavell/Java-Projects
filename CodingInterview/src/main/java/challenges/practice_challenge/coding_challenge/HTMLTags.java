package challenges.practice_challenge.coding_challenge;

import java.util.Stack;

public class HTMLTags {
    public static void main(String[] args) {
        String str = "<a><b><c></b></c></a>";
       // String str = "<a><b></b></a>";
        System.out.println(HTMLTags.isBalance(str));
    }
    public static boolean isBalance(String str){
        Stack<Character> stackOfCards = new Stack<>();
        int count =0;
        while (count < str.length()) {
            if ( str.charAt(count) == '<') {
                count++;
                if (str.charAt(count) != '/') {
                    stackOfCards.push(str.charAt(count));
                    count++;
                } else {
                    count++;
                    if(str.charAt(count) != stackOfCards.pop()){
                        return false;
                    }
                }
            } else {
                count++;
            }
        }
        return stackOfCards.empty();
    }
}
