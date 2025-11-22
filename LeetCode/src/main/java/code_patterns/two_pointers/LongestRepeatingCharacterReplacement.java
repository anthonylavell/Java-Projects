package code_patterns.two_pointers;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int leftIndx = 0;
        int maxLen = 0;
        int maxCount = 0;
        int[] letter = new int[128];
        for (int rightIndx = 0; rightIndx < s.length();rightIndx++){
            char ch = s.charAt(rightIndx);
            letter[ch]++;
            maxCount = Math.max(maxCount,letter[ch]);
            while (((rightIndx-leftIndx)+1)-maxCount  > k){
                ch = s.charAt(leftIndx++);
                letter[ch]--;
            }
            maxLen = Math.max(maxLen,(rightIndx-leftIndx)+1);
        }
        return maxLen;
    }

    private static void setUpTest(String[]tests){
        for (String str : tests){
            String[] parts = str.split(",",-1);
            String s = parts[0];
            int k = Integer.parseInt(parts[1]);
            System.out.printf("Longest Repeating Character Length: %d%n",characterReplacement(s,k));
        }
    }

    public static void main(String[] args) {
        String[] tests = {"ABAB,2","AABABBA,1","ABCD,1","AAAAABBBBCBB,4"};
        setUpTest(tests);
    }
}
