package leetcode.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Closest {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        // method:use binary search to get the index of target,and then seach from the index of target to get the mininal distance between num[i] and nums[targetIndex]
        if (arr == null || arr.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        int right = binarySearch( x, arr);
        int left = right-1;
        List result = new ArrayList();
        for(int i=k; i>0; i--){
            if(left<0)
                result.add(arr[right++]);
            else if(right>=arr.length)
                result.add(arr[left--]);
            else if(x-arr[left]<=arr[right]-x)
                result.add(arr[left--]);
            else
                result.add(arr[right++]);

        }
        Collections.sort(result);
        return result;
    }

    public static int binarySearch(int target, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid = -1;
        while (left <= right) {
            mid = (left +right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return mid;
    }

}
