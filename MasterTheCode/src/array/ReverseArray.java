package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //char [] s = {'h','e','l','l','o'};
        char [] s = {'a','n','t','h','o','n','y'};
        //char [] s = {'h'};
        reverseString(s);
        System.out.println(Arrays.toString(s));

    }

    public static void reverseString(char[] s){
        int endIndex = s.length-1;
        for(int startIndex = 0; startIndex<=endIndex; startIndex++){
            char tempArray = s[startIndex];
            s[startIndex] = s[endIndex];
            s[endIndex] = tempArray;
            endIndex--;
        }
    }
}
