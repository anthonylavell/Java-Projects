import java.util.Stack;

class Solution {
   
    public static void main(String[] args) {
        String str = "{({}[()])}";
        System.out.println(isValid(str));
    }
    
    public static boolean isValid(String str) {
        Stack stackOfCharacters = new Stack<>();
        for(int count = 0; count < str.length(); count++){
            if(str.charAt(count) == '{' || str.charAt(count) == '[' || str.charAt(count) == '(' ){
                stackOfCharacters.add(str.charAt(count));
            }
            else if((returnSymbol(str.charAt(count)) != stackOfCharacters.peek()) || count == 0 ){
                    break;
            }else{
                stackOfCharacters.pop();
            }
        }
        
        return stackOfCharacters.empty();
        
    }

    private static Character returnSymbol(char sym){
        switch(sym){
            case '}':
                return '{';
            case ']':
                return '[';
            default:
                return '(';
        }

    }
}