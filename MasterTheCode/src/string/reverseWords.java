package string;

public class reverseWords {
    public static void main(String[] args) {
        //String str = "Ward dog";
        String str = "Let's take LeetCode contest";
        int index = 0;
        char [] chArray = str.toCharArray();
        words(chArray,index);
        str = String.valueOf(chArray);
        //words(str, index);
        System.out.println("str = " +  str);
    }
    public static void words(char [] chArray, int index){
        int start = index;
        while (index < chArray.length && chArray[index] != ' ' ){
            index++;
        }
        int end = index-1;
        index++;
        while (start < end){
            char tempChar = chArray[start];
            chArray[start] = chArray[end];
            chArray[end] = tempChar;
            start++;
            end--;
        }
            if(index<chArray.length){
                words(chArray,index);
            }
    }
}
