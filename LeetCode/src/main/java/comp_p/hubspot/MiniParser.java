package comp_p.hubspot;
/*
Given a string s represents the serialization of a nested list,
implement a parser to deserialize it and return the deserialized
NestedInteger.

Each element is either an integer or a list whose elements may
also be integers or other lists
Example 1:

Input: s = "324"
Output: 324
Explanation: You should return a NestedInteger object which contains a single integer 324.
Example 2:

Input: s = "[123,[456,[789]]]"
Output: [123,[456,[789]]]
Explanation: Return a NestedInteger object containing a nested list with 2 elements:
1. An integer containing value 123.
2. A nested list containing two elements:
    i.  An integer containing value 456.
    ii. A nested list with one element:
         a. An integer containing value 789
 */

import comp_p.hubspot.main.NestedInteger;

import java.util.Stack;

public class MiniParser {
    public static void main(String[] args) {
        String s = "324",str2 = "[123,[456,[789]]]";
        //deserialize(s);

        NestedInteger nested = deserialize(str2);
        System.out.println(nested);
    }

    public static NestedInteger deserialize(String s) {
        if (s.charAt(0) != '['){
            return new NestedInteger(Integer.parseInt(s));
        }
        int leftIndx = 0;
        NestedInteger nested = null;
        Stack<NestedInteger> stack = new Stack<>();
        for (int rightIndx = 0; rightIndx < s.length(); rightIndx++){
            char ch = s.charAt(rightIndx);
            switch (ch){
                case '['-> {
                    if (nested!=null){
                        stack.add(nested);
                    }
                    nested = new NestedInteger();
                    leftIndx = rightIndx + 1;
                }
                case ',',']'-> {
                    if (leftIndx < rightIndx){
                        int num = Integer.parseInt(s.substring(leftIndx,rightIndx));
                        nested.add(new NestedInteger(num));
                    }
                    if(ch == ']') {
                        if (!stack.isEmpty()) {
                            NestedInteger temp =stack.pop();
                            temp.add(nested);
                            nested = temp;
                        }
                    }
                    leftIndx = rightIndx +1;
                }
            }
        }
        return nested;
    }
}
