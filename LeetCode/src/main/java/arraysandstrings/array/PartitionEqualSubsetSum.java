package arraysandstrings.array;

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        //int[] nums = {1,5,11,5};
        //int[] nums = {4,4,4,4,8,8};
        //int[] nums = {1,2,3,5};
        //int[] nums = {3,3,3,4,5};
        //int[] nums = {1,2,3,4,5,6,7};
        int[] nums = {2,2,1,1};
        canPartition(nums);
    }

    public static boolean canPartition(int[] nums) {
        //Arrays.sort(nums);
        int total = 0;
        for(int num : nums){
            total += num;
        }
        if(total%2==1){
            return false;
        }
        int target = total /2;
        boolean [] dp = new boolean[target+1];
        dp[0]= true;
        for(int num : nums){
            for(int i = target; i >= num; i--){
                if(dp[i-num]){
                    dp[i] = true;
                    if(i == target){
                        return dp[i];
                    }
                }
            }
        }
        return dp[target];
    }
    public static boolean partition(int a[],int sum,int i,Boolean dp[][]){
        if(sum==0)
            return true;
        if(i>=a.length || sum<0)
            return false;
        if(dp[i][sum]!=null)
            return dp[i][sum];
        return dp[i][sum]=(partition(a,sum-a[i],i+1,dp) || partition(a,sum,i+1,dp));
    }
}
