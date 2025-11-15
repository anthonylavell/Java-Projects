package comp_p.pay_pal;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        int[]letters = new int[128];
        char[]chars = s.toCharArray();
        int totalCount = 0;
        int leftIndex = 0;
        String minStr = "";
        for (char ch : t.toCharArray()){
            if (++letters[ch] == 1){
                totalCount++;
            }
        }
        for (int rightIndex = 0; rightIndex < chars.length; rightIndex++){
            if (--letters[chars[rightIndex]] == 0) {
                totalCount--;
            }
            while (totalCount==0){
                if (minStr.isEmpty() || (rightIndex-leftIndex)+1 < minStr.length()){
                    minStr = s.substring(leftIndex,(rightIndex+1));
                }
                char ch = chars[leftIndex++];
                if (++letters[ch]>0){
                    totalCount++;
                }
            }
        }
        return minStr;
    }

    private static void test(String[] parts){
        for (String part : parts){
            String[] strs = part.split(",",-1);
            String s = strs[0];
            String t = strs[1];
            System.out.println(minWindow(s,t));
        }
    }
    public static void main(String[] args) {
        String[] testcases = {"ADOBECODEBANC,ABC","a,a","a,aa"};
        test(testcases);
        //System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
}
