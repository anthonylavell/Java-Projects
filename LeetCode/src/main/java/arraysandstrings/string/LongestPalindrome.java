package arraysandstrings.string;

public class LongestPalindrome {
    public static void main(String[] args) {
        int[] counting = new int[126];
        char ch = 'z';
        System.out.println( ch-'0');
        counting['A'-'0']++;
        System.out.println( counting['A'-'0']);
    }

    public static int longestPalindrome2(String s) {
        int total = 0;
        int[] counting = new int[126];
        for (char ch : s.toCharArray()){
           counting[ch-'a']++;
            if( counting[ch-'a']%2 == 0){
                total+=2;
            }
        }
        return s.length()%2==total ? total : total +1;
    }
}
