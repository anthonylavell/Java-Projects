package challenges.practice_challenge.coding_challenge;

import java.util.ArrayList;
import java.util.List;

public class FindWord {
    public static void main(String[] args) {
        String [] strOfArrays = {"cat", "bat", "father", "mother"};
        String InterleavedWord = "fcaatther";
        System.out.println( FindWord.found(strOfArrays, InterleavedWord) );

    }

    public static List<String> found( String [] strOfArrays, String InterleavedWord){
        //Create a list to return any words that is found
       List<String> listOfStrings = new ArrayList<>();

       //First loop is to iterate through the array elements
        for(int count = 0; count< strOfArrays.length; count++){
            //Convert array string into characters
            char [] ch = strOfArrays[count].toCharArray();
            //Store each parameter string in a temp String so we can remove character. I'm doing this so the data in the parameter string is no changed
            String tempStr = InterleavedWord;
            //Store any character found
            String storeFoundWord="";
            int chCount =0;
            while (chCount < ch.length){
                if(!tempStr.contains( String.valueOf(ch[chCount]))){
                    break;
                }
                int index = tempStr.indexOf(String.valueOf(ch[chCount]));
                storeFoundWord+=ch[chCount];
                tempStr = String.valueOf(new StringBuilder(tempStr).deleteCharAt(index));
                chCount++;
            }
            if(strOfArrays[count].equals( storeFoundWord.trim() )){
                listOfStrings.add(strOfArrays[count]);
            }
        }
        return listOfStrings;
    }
}
