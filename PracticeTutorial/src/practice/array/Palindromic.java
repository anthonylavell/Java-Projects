package practice.array;

public class Palindromic {
    public static String longestPalindrome(String s) {
        if(s == null || s.length() == 1 || s.isEmpty())
            return s;
        String newStr = s.substring(0,1);
        for(int i = 0; i < s.length()-1; i++){
            if(newStr.length() >= s.substring(i, s.length()).length()){
                break;
            }
            int isCharFound = s.substring(i+1, s.length()).indexOf(s.charAt(i));
            if( isCharFound >= 0){
                for(int x =s.length(); x >i ; x--){
                    String tempStr = s.substring(i,x);
                    String reverseStr = new StringBuilder(tempStr).reverse().toString();
                    if(reverseStr.equals(tempStr) && tempStr.length() > newStr.length()){
                        newStr = tempStr;
                        break;
                    }
                    if((x-1) > i){
                        int tempCharFound = s.substring((i+1), x-1).indexOf(s.charAt(i));
                        if(tempCharFound < 0){
                            break;
                        }else if(newStr.length() >= s.substring(i,x-1).length()){
                            break;
                        }
                    }
                }
            }
        }
        return newStr;
    }
}
