package ds.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    private List<Integer> storeSequence;
    public Fibonacci(){
        storeSequence = new ArrayList<>(Arrays.asList(0,1));
    }

    public int sequence(int number){
        int sum =  storeSequence.get( (number -1) ) + storeSequence.get( (number -2) );
        storeSequence.add(sum);
        return sum;
    }
}
