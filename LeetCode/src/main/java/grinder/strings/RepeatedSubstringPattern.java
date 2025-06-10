package grinder.strings;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(repeatedSubstringPattern(str));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        // Try all possible lengths of the repeating substring
        for (int len = 1; len <= n / 2; len++) {
            // Only proceed if length divides the full length evenly
            if (n % len == 0) {
                String substring = s.substring(0, len);
                StringBuilder repeated = new StringBuilder();

                // Build the repeated string
                for (int i = 0; i < n / len; i++) {
                    repeated.append(substring);
                }

                // Compare with original
                if (repeated.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}
