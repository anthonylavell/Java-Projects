package practice.test;

public class TestSingleNumber {
    public static void main(String[] args){
        int num = 0;

        //int [] nums = {2,2,1};
        //int [] nums = {2,1,2};
        int [] nums = {4,1,2,1,2};
        //int [] nums = {1,2,1,2,4};
        //System.out.println(Single.singleNumber(nums));
        for(int numb : nums){
            num =num^numb;
            System.out.println(num);
        }

    }
}
