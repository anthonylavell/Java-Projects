package comp_p.pay_pal;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,-4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int min = 0;
        int max = 0;
        int total = -11;
        for (int num : nums){
            if (num==0){
                min =0;
                max = 0;
            }else if (min==0 && max == 0){
                min = num;
                max = min;
            }else {
                int tempMax = max;
                max = Math.max(num,Math.max(min*num,tempMax*num));
                min = Math.min(num,Math.min(min*num,tempMax*num));
            }
            total = Math.max(total,max);
        }
        return total;
    }
}
