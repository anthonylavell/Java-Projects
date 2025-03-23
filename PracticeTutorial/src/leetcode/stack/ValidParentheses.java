package leetcode.stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        int pos = -1;
        char [] chArrays = new char[s.length()];
        for(char ch : s.toCharArray()){
            if(ch == '{'){
                chArrays[++pos]='}';
            }else if(ch == '['){
                chArrays[++pos]=']';
            }else if(ch == '('){
                chArrays[++pos]=')';
            }else {
                if(pos == -1 || ch != chArrays[pos]){
                    return false;
                }
                pos--;
            }
        }
        return pos ==-1;
    }
}
