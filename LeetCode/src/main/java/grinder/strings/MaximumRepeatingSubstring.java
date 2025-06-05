package grinder.strings;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";

        String sequence2 = "ababc";
        String word2 = "ba";

        String sequence3 = "ababc";
        String word3 = "ac";

        String sequence4 = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word4 = "aaaba";

        String sequence55 = "a";
        String word5 = "a";
        //System.out.println(sequence4.length());
        System.out.println(maxRepeating(sequence,word));
    }
    public static int maxRepeating(String sequence, String word) {
        int max = 0;
        int len = sequence.length()-word.length();
        for (int left = 0; left <= len; left++){
            if (sequence.charAt(left) != word.charAt(0)){
                continue;
            }
            int index = left;
            int right = left +word.length();
            int subTotal = 0;
            while ( index <= len && sequence.substring(index, right).equals(word)) {
                    subTotal++;
                    index = right;
                    right+=word.length();
            }
            max = Math.max(max,subTotal);
        }
        return max;
    }

    public static int maxRepeating2(String sequence, String word) {
        int max = 0;
        StringBuilder repeatStr = new StringBuilder();
        while (true){
            repeatStr.append(word);
            if (!sequence.contains(repeatStr.toString())){
                break;
            }
            max++;
        }
        return max;
    }
}
