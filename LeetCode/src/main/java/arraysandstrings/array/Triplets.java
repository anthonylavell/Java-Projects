package arraysandstrings.array;
import java.util.*;

public class Triplets {
    private static List<List<Integer>> listOfInteger;
    public static List<List<Integer>> threeSum(int[] arrOfNums){
        listOfInteger = new ArrayList<List<Integer>>();
        if(arrOfNums.length >= 3){
            Arrays.sort(arrOfNums);
            for(int startIndex = 0; startIndex < (arrOfNums.length-2); startIndex++){
                if(startIndex > 0 && arrOfNums[startIndex] == arrOfNums[startIndex-1]){
                    continue;
                }
                for(int endIndex = startIndex+1; endIndex < arrOfNums.length-1; endIndex++){
                    if(endIndex != (startIndex+1)&& arrOfNums[endIndex] == arrOfNums[(endIndex-1)]){
                        continue;
                    }
                    int index = Arrays.binarySearch(arrOfNums,endIndex+1, arrOfNums.length,-(arrOfNums[startIndex]+arrOfNums[endIndex]) );
                    if(index > 0){
                        addToList(new ArrayList<>(Arrays.asList(arrOfNums[startIndex],arrOfNums[endIndex],arrOfNums[index])));
                    }
                }
            }

        }

        return listOfInteger;
    }

    private static void addToList( ArrayList<Integer>list){
        if(!listOfInteger.contains(list)){
            listOfInteger.add(list);
        }
    }
}
