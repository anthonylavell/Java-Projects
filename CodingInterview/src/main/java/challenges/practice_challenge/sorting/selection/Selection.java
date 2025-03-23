package challenges.practice_challenge.sorting.selection;

public class Selection {
    public static int [] sort(int [] sortArray){
        for(int lowestN = 0; lowestN <sortArray.length; lowestN++){
            int temp = lowestN;
            for(int i = lowestN+1; i <sortArray.length; i++){
                if(sortArray[temp] > sortArray[i]){
                    temp = i;
                }
            }
            int newLow = sortArray[lowestN];
            sortArray[lowestN] = sortArray[temp];
            sortArray[temp] = newLow;
        }
        return sortArray;
    }
}
