package leetcode.list.main;

import leetcode.list.Closest;

public class ClosestMain {
    public static void main(String[] args) {
        //int [] arr ={1,2,3,4,5};
        int [] arr ={10,25,30,35,40,45};
        int x = 35;
        int k = 4;
       int mid = Closest.binarySearch(x,arr);
        System.out.println("mid = " + mid);
        System.out.println(Closest.findClosestElements(arr,k,x));
    }
}
