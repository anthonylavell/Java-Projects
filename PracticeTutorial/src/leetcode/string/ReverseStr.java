package leetcode.string;

public class ReverseStr {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        //reverseString(s);
        //System.out.println(Arrays.toString(s));
        //String str = "Ward to Anthony";
        String str = "a's s'a x's";
        System.out.println(reverseWords(str));
    }
    public static void reverseString(char[] s) {
        int leftIndex = 0;
        int rightIndex = s.length-1;
        while ( leftIndex<rightIndex){
            char tempChar = s[leftIndex];
            s[leftIndex] = s[rightIndex];
            s[rightIndex] = tempChar;
            leftIndex++;
            rightIndex--;
        }
    }

    public static String reverseWords(String str) {
        char [] ch = str.toCharArray();
        reverseString(ch,0);
        return new String(ch);
    }

    private static void reverseString(char[] s, int index) {
        int leftIndex = index;
        while (index<s.length && s[index] != ' '){
            index++;
        }
        int rightIndex = index-1;
        index++;
        while (leftIndex<rightIndex){
            char tempChar = s[leftIndex];
            s[leftIndex] = s[rightIndex];
            s[rightIndex] = tempChar;
            leftIndex++;
            rightIndex--;
        }
        if(index<s.length){
            reverseString(s,index);
        }
    }

    private static String reverseString(String str) {
        char [] s = str.toCharArray();
        int rightIndex = s.length-1;
        for(int i = 0; i < rightIndex; i++){
            char temp = s[i];
            s[i] = s[rightIndex];
            s[rightIndex]=temp;
            rightIndex--;
        }
        return String.valueOf(s);
    }
}
