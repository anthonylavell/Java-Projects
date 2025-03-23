package array.minimum_swaps;

public class ClientNumber {
    public static void main(String[] args) {
        // 1  2 3 4 5 6 7
        //int [] arrOfNum = {1, 3, 5, 2 ,4, 6, 7}; // 3
        //1,2,3,4
        //int [] arrOfNum = {4,3,1,2}; // 3
        int [] arrOfNum = {2, 3, 4,1, 5}; //3
        System.out.println(Numbers.minimumSwaps(arrOfNum) );
    }
}
