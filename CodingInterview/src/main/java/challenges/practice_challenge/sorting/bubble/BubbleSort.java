package challenges.practice_challenge.sorting.bubble;

public class BubbleSort {
    public static int [] sort(int [] sortArray){
        for(int i = 0; i <sortArray.length; i++){
            for(int count =0; count < sortArray.length-(i+1); count++){
                if(sortArray[count] > sortArray[(count+1)]){
                    int temp = sortArray[count];
                    sortArray[count ]= sortArray[count+1];
                    sortArray[count+1] = temp;
                }

            }

        }
        return sortArray;
    }
}
