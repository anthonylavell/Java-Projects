package practice.array;

public class Triplet {
    public static boolean increasingTriplet(int[] nums){
        int lowestN= Integer.MAX_VALUE;
        int greatestN = Integer.MIN_VALUE;
        for(int num:nums){
            if(num <= lowestN){
                lowestN = num;
            }
            else if(num > greatestN && greatestN != Integer.MIN_VALUE){
                return true;
            }else if(num > lowestN) {
                greatestN = num;
            }
        }
        return false;
    }
}
