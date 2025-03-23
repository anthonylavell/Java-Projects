package ds.list.min_stack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinStack {
    private List<Integer>stackList;
    public MinStack() {
        this.stackList = new ArrayList<>();
    }

    public void push(int x) {
        stackList.add(0,x);
    }

    public void pop() {
        if(!stackList.isEmpty()) {
            stackList.remove(0);
        }
    }

    public int top() {
        if(stackList.isEmpty()){
            exceptionMessage();
        }

        return stackList.get(0);
    }

    public int getMin() {
        if(stackList.isEmpty()){
            exceptionMessage();
        }

        return stackList.stream().min(Comparator.comparing(Integer::valueOf)).get();
    }

    private void exceptionMessage(){
        throw new NullPointerException("Add numbers to Stack");
    }
}
