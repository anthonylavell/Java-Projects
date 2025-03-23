package leetcode.heap;

public class MergeMaxHeap {
    public static MaxHeap Merge(MaxHeap firstHeap, MaxHeap secondHeap){
        MaxHeap maxHeap = new MaxHeap( (firstHeap.getSize() + secondHeap.getSize()) );
        insert(maxHeap,firstHeap);
        insert(maxHeap,secondHeap);
        return maxHeap;
    }

    private static void insert(MaxHeap temp, MaxHeap insertValue){
        for(int i = 0; i < insertValue.getSize(); i++){
            temp.insert(insertValue.get(i));
        }
    }

}
