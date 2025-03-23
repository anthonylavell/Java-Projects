package arraysandstrings.array.client;

import arraysandstrings.array.Triplet;

public class TripletMain {
    public static void main(String[] args) {
        //int[] numbers = {5,1,5,5,2,5,4};
        int[] numbers = {5,1,5,0,2,1,5,4};
        //int[] numbers = {5,1,5,5};
        //int[] numbers = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100000000};
        //int[] numbers = {2,5,4,0,6};
        Triplet triplet = new Triplet();
        System.out.println( triplet.increasingTriplet(numbers));
        System.out.println("\n == New Methods ==");
        System.out.println(increasingTriplet(numbers));
    }

    public static boolean increasingTriplet(int[] nums) {

        if(nums.length >= 3){
            int least =Integer.MAX_VALUE;
            int great =Integer.MAX_VALUE;
            for(int num : nums){
                if(num <= least){
                    least = num;
                }else if( num <= great){
                    great = num;
                }else{
                    return true;
                }
            }

        }
        return false;


    }
}
