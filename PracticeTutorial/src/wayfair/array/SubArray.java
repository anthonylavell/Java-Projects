package wayfair.array;

public class SubArray {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,2,1};
        int [] nums2 = {3,2,1,4,7};
        /*int [] nums5 = {1,4,7,3,2};
        int [] nums6 = {3,2,1,4,7};
        int [] nums7 = {70,39,25,40,7};
        int [] nums8 = {52,20,67,5,31};*/
        System.out.println(findLength(nums1,nums2));
    }
    public static int findLength(int[] nums1, int[] nums2) {
        int total = 0;
        int [][] matrix = new int[nums1.length+1][nums2.length+1];
        for(int row = nums1.length-1; row >=0 ; row--){
            for (int col =nums2.length-1; col >=0; col--){
                if(nums1[row]==nums2[col]){
                    matrix[row][col] = matrix[row+1][col+1] +1;
                    if(total<matrix[row][col]){
                        total=matrix[row][col];
                    }
                }
            }
        }
        return total;
    }
}
