package leetcode.heap;

public class MaxHeap {
    private int[] heap;
    private int maxSize;
    private int currentSize;

    public MaxHeap(int maxSize){
        this.maxSize = maxSize;
        heap = new int[this.maxSize];
        currentSize = 0;
    }

    public boolean insert(int val){
        if(isFull()){
            return false;
        }
        heap[currentSize] = val;
        trickleUp(currentSize);
        currentSize++;
        return true;
    }

    public int getSize(){
        return currentSize;
    }

    public int get(int num){
       return (isEmpty() || (num >currentSize-1)) ? heap[-1] : heap[num];

    }

    public boolean remove(){
        if(isEmpty()){
            return false;
        }
        heap[0]= heap[(currentSize-1)];
        heap[(currentSize-1)] = 0;
        currentSize--;
        trickleDown();
        return true;

    }

    public boolean remove2(){
        if(isEmpty()){
            return false;
        }
        heap[0]= heap[(currentSize-1)];
        heap[(currentSize-1)] = 0;
        currentSize--;
        return true;

    }

    private boolean isEmpty(){
        return currentSize == 0;
    }

    private boolean isFull(){
        return currentSize >= maxSize;
    }

    private void trickleUp(int currentIndex){
        int valueToInsert = heap[currentIndex];
        int parentIndex = (currentIndex-1)/2;
        while (currentIndex > 0 && heap[parentIndex] < valueToInsert){
            heap[currentIndex] = heap[parentIndex];
            currentIndex = parentIndex;
            parentIndex = (currentIndex-1)/2;
        }
        heap[currentIndex] = valueToInsert;
    }

    private void trickleDown(){
        int valueToInsert = heap[0];
        int currentIndex = 0;
        int leftSide = ((2*currentIndex)+1);
        int rightSide = ((2*currentIndex)+2);
        while (leftSide < currentSize ){
            if(rightSide < currentSize ){
                 if(heap[rightSide]> heap[leftSide]){
                     if(valueToInsert < heap[rightSide]) {
                         heap[currentIndex] = heap[rightSide];
                         currentIndex = rightSide;
                     }
                 }else {
                     if(valueToInsert < heap[leftSide]) {
                         heap[currentIndex] = heap[leftSide];
                         currentIndex = leftSide;
                     }

                 }
            }else if(valueToInsert < heap[leftSide]) {
                heap[currentIndex] = heap[leftSide];
                currentIndex = leftSide;

            }else {
                break;
            }
            leftSide = ((2*currentIndex)+1);
            rightSide = ((2*currentIndex)+2);
        }
        heap[currentIndex]=valueToInsert;

    }



    public int[] display(){
        int [] tempHeap = new int[currentSize];
        for(int i = 0; i < currentSize; i++){
            tempHeap[i] = heap[i];
        }
        return tempHeap;
    }
    
}
