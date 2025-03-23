package challenges.practice_challenge.coding_challenge;

public class STR {
    public static void main(String[] args) {
        //String str= null;
       // System.out.println(STR.reverse(str));
        //System.out.println(STR.reverseUsingArray(str));

        String str = "abbcafe";
        System.out.println(longestNonRepeating(str));
    }

    // Without converting the string into an char Array
    public static String reverse(String str) {
        if(str == null){
            return "Nothing in the String";
        }
        String tempStr="";
        for (int index = str.length()-1; index >=0; index--){
            tempStr+= str.charAt(index);
        }
        return tempStr;
    }

    // Converting the string into an char Array
    public static String reverseUsingArray(String str) {
        if(str == null){
            return "Nothing in the String";
        }
        String tempStr="";
        char [] ch = str.toCharArray();
        // With out converting the string into an char Array
        for (int index = ch.length-1; index >=0; index--){
            tempStr+= ch[index];
        }
        return tempStr;
    }

    public static String longestNonRepeating(String str){
        //first index of the string
        int firstIndex = 0;
        //second index
        int traverseIndex = firstIndex +1;
        String noRepeatStr="";
        //store the first character in the string in temp variable
        String tempStr = String.valueOf(str.charAt(firstIndex));

        while (firstIndex < str.length()){
            if(traverseIndex < str.length()) {
                if (str.charAt(firstIndex) != str.charAt(traverseIndex)  ) {
                    tempStr += str.charAt(traverseIndex);
                    traverseIndex++;
                    continue;
                }
            }

            if(noRepeatStr.length()< tempStr.length()){
                noRepeatStr = tempStr;
            }
            if(noRepeatStr.length() >= (str.length() - firstIndex)){
                break;
            }
            firstIndex++;
            traverseIndex=firstIndex+1;
            tempStr=String.valueOf(str.charAt(firstIndex));
        }
        return noRepeatStr;
    }
}
