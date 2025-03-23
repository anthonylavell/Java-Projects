package challenges.practice_challenge.coding_challenge;

import java.util.Stack;

public class Balance {
    public static void main(String[] args) {
        //String str ="{[}]}";
        //String str ="{[]}";
        //String str = "[()]{}{[()()]()}";
        //String str = "[()]{}{[()()](})";
        //String str = "{{{()}}";
        //String str = "{{";
        //String str = "}}";
        //String str = "{}}}";
        String str = "{{}{";
        System.out.println(isRegexBal(str));

    }

    public static boolean isRegexBal(String str){
        if(str.length()%2 == 1){
            System.out.println("Odd numbers");
            return false;
        }
        Stack front = new Stack();

        for(int count = 0; count < str.length(); count++){
            if(str.charAt(count) == '{' || str.charAt(count) == '[' || str.charAt(count) == '(') {
                front.push(str.charAt(count));
                continue;
            }
            if(!front.empty()){
                String match = front.pop()+String.valueOf(str.charAt(count));
                if(!match.equals("{}") && !match.equals("[]") && !match.equals("()") ){
                    System.out.println("Not Balance");
                    return false;
                }
            }else {
                System.out.println("Not Balance");
                return false;
            }
        }

        return front.empty();
    }
}
