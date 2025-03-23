package leetcode.string;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {

        String str = "ab";
        String str2 = "eidboaoo";
        System.out.println(checkInclusion(str,str2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        char [] ch = s1.toCharArray();
        Arrays.sort(ch);
        s1 = String.valueOf(ch);
        for(int i = 0; i <=(s2.length()-s1.length());i++) {
            char[] ch2 = s2.substring(i, i + s1.length()).toCharArray();
            Arrays.sort(ch2);
            String tempStr = String.valueOf(ch2);
            if (tempStr.contains(s1)) {
                return true;
            }
        }
        return false;

    }
}
