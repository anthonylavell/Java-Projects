package challenges.practice_challenge.sorting.insertion;

public class Insertion {
    public static int[] sort(int[] sortArray) {
        for (int sortC = 1; sortC < sortArray.length; sortC++) {
            int unSortC = sortC;
            while (unSortC > 0 && sortArray[unSortC - 1] > sortArray[unSortC]) {
                int temp = sortArray[unSortC - 1];
                sortArray[unSortC - 1] = sortArray[unSortC];
                sortArray[unSortC] = temp;
                unSortC--;
            }

        }
        return sortArray;
    }

    /*public static int[] sort(int[] sortArray) {
        for(int sortC = 1; sortC < sortArray.length; sortC++){
            if(sortArray[sortC-1] > sortArray[sortC]){
                int temp = sortArray[sortC-1];
                sortArray[sortC-1] = sortArray[sortC];
                sortArray[sortC]=temp;
                for(int unsortC = sortC-1; unsortC > 0; unsortC--){
                    if(sortArray[unsortC-1] < sortArray[unsortC])
                        break;
                    temp = sortArray[unsortC-1];
                    sortArray[unsortC-1] = sortArray[unsortC];
                    sortArray[unsortC] = temp;
                }
            }
        }*/
}
