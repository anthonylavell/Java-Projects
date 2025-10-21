package comp_p.capital_one.powerday;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^\\p{Alnum}]","").toLowerCase();
        int rightLen = s.length()-1;
        for (char left : s.toCharArray()){
            char right = s.charAt(rightLen);
            if (left != right){
                return false;
            }
            rightLen--;
        }
        return true;
    }
}
