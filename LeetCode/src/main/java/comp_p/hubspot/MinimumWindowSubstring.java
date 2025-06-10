package comp_p.hubspot;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));

    }

    public static String minWindow(String s, String t) {
        String resultStr = "";
        int[] letterCount = new int[128];
        int left = 0;
        int count = 0;

        // 1) Build frequency table for t
        for (char ch : t.toCharArray()) {
            letterCount[ch]++;
        }

        // 2) Expand the right end of the window
        for (int right = 0; right < s.length(); right++) {
            // Decrement count for this char; if it was needed (>=0 after decrement), we’ve covered one more
            if (--letterCount[s.charAt(right)] >= 0) {
                count++;
            }

            // 3) Once we’ve covered all of t, try to shrink from the left
            while (count == t.length()) {
                // Update result if this window is smaller
                if (resultStr.isEmpty() || resultStr.length() > (right - left + 1)) {
                    resultStr = s.substring(left, right + 1);
                }
                // Release the left char; if it becomes “needed” again (>0), we lose coverage
                if (++letterCount[s.charAt(left)] > 0) {
                    count--;
                }
                left++;
            }
        }
        return resultStr;
    }
}
