package arraysandstrings.string;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String str = "abd#c";
        String str2 = "b";
        //backspaceCompare(str,str2);
        List<Integer> minList = new ArrayList<>();
        minList.add(0,1);
        minList.add(0,2);
        minList.add(0,3);
        System.out.println(minList.get(0));
        minList.remove(0);
        System.out.println(minList.get(0));
    }

    public static boolean backspaceCompare(String s, String t) {
        return backSpace(s).equals(backSpace(t));
    }

    private static String backSpace(String str){
        StringBuilder temp = new StringBuilder();
        Deque<Character> queueOfChars = new ArrayDeque<>();
        for(char ch : str.toCharArray()){
            if(ch != '#'){
                queueOfChars.add(ch);
            }else  {
                if(!queueOfChars.isEmpty()){
                    queueOfChars.pollLast();
                }
            }
        }

        while (!queueOfChars.isEmpty()){
            temp.append(queueOfChars.poll());
        }
        return temp.toString();
    }
}
