package string;

import java.util.Arrays;

public class ReverseStr {
    public static void main(String[] args) {
        String str = "Hello Ward";
        char[] ch = str.toCharArray();
        words(ch,0);
        str = String.valueOf(ch);
        System.out.println("str = " + str);



    }

    public static void words(char [] ch, int index){
        int leftIndex = index;
        while (index < ch.length && (int)ch[index]!= 32){
            index++;
        }
        int rightIndex = index-1;
        while (leftIndex < rightIndex){
            char tempCh = ch[rightIndex];
            ch[rightIndex] = ch[leftIndex];
            ch[leftIndex] = tempCh;
            leftIndex++;
            rightIndex--;
        }
        if(index < ch.length){
            words(ch, index+1);
        }
    }

    public static String words2(String str){
        char [] tempWords = str.toCharArray();
        str = "";
        String tempStr="";
        for(int i = tempWords.length-1; i >=0 ; i--) {

            if((int)tempWords[i] == 32){
                str=tempWords[i]+tempStr+str;
                tempStr = "";
            }else {
                tempStr += tempWords[i];
            }
        }
        return (tempStr+str);
    }

    private static String reverseWord(String str){
        return String.valueOf(new StringBuilder(str).reverse());
    }
}
