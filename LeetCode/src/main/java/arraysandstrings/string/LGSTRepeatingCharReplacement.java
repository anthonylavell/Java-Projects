package arraysandstrings.string;

public class LGSTRepeatingCharReplacement {
    public static void main(String[] args) {

    }
    public static int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int mostFeq = 0;
        int total = 0;
        int [] chars = new int[27];
        while (right < s.length()){
            char ch = s.charAt(right);
            chars[ch-'A']++;
            mostFeq = Math.max(mostFeq,chars[ch-'A']);
            while ((right-left)+1 - mostFeq > k){
                ch = s.charAt(left);
                chars[ch-'A']--;
                left++;
            }
            total = Math.max(total,(right-left)+1);
            right++;
        }
        return total;
    }
}
