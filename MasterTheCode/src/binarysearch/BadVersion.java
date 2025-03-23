package binarysearch;

public class BadVersion{
    public static void main(String[] args) {
        String [] trueOrFalse = {"F","F","F","F","T","T","T"};
        //String [] trueOrFalse = {"F","F","T","T","F","F","F"};
        //String [] trueOrFalse = {"T","T","T","T","F","F","F"};
        //String [] trueOrFalse = {"F","F","F","T","T","T","T"};
        System.out.println(firstBadVersion(trueOrFalse));
    }
    public static int firstBadVersion(String [] trueOrFalse){
        int startIndex =0;
        int endIndex = trueOrFalse.length-1;
        int foundIndex = -1;
        while (startIndex <= endIndex){
            int middleIndex = (int)Math.round((startIndex+endIndex)/2.0);
            if(trueOrFalse[middleIndex].equals("T")){
                foundIndex=middleIndex;
                endIndex = middleIndex-1;
            }else {
                startIndex=middleIndex+1;
            }
        }
        return foundIndex;
    }

}
