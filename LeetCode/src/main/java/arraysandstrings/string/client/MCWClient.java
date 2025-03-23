package arraysandstrings.string.client;

import arraysandstrings.string.STR;

public class MCWClient {
    public static void main(String[] args) {
        //String paragraph = "i love pancakes and my kids. my kids is my world and they love pancakes. pancakes";
       String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit";
       // String paragraph = "a, a, a, a, b,b,b,c, c";
        //String paragraph = "A.";
        String[] banned = {"hit"};
        STR.mostCommonWord(paragraph,banned);
    }
}
