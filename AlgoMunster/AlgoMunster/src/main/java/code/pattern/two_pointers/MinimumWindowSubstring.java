package code.pattern.two_pointers;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {

    }

    public String minWindow(String original, String check) {
        Map<Character, Integer> checkCount = new HashMap<>();
        Map<Character, Integer> windowCount = new HashMap<>();
        for (char ch : check.toCharArray()) {
            checkCount.merge(ch, 1, Integer::sum);
        }
        int satisfied = 0;
        int required = checkCount.size();
        int m = original.length();
        int window = -1;
        int length = m + 1;
        int l = 0;
        for (int r = 0; r < m; ++r) {
            windowCount.put(original.charAt(r), windowCount.getOrDefault(original.charAt(r), 0) + 1);
            if (windowCount.get(original.charAt(r)) == checkCount.get(original.charAt(r))) {
                satisfied++;
            }
            while (satisfied == required) {
                if (r - l + 1 < length ||
                        (r - l + 1 == length && original.substring(l, r + 1).compareTo(original.substring(window, window + length)) < 0)) {
                    window = l;
                    length = r - l + 1;
                }
                windowCount.put(original.charAt(l), windowCount.get(original.charAt(l)) - 1);
                if (checkCount.containsKey(original.charAt(l)) && windowCount.get(original.charAt(l)) < checkCount.get(original.charAt(l))) {
                    satisfied--;
                }
                l++;
            }
        }
        return window >= 0 ? original.substring(window, window + length) : "";
    }
}
