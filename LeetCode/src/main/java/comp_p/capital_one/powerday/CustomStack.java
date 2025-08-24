package comp_p.capital_one.powerday;

public class CustomStack {
    private int[]stack;
    private int eleCount;
    public CustomStack(int maxSize) {
        this.stack = new int[maxSize];
        this.eleCount = 0;
    }

    public void push(int x) {
        if (eleCount < stack.length) {
            stack[eleCount] = x;
            eleCount++;
        }
    }

    public int pop() {
        int val = -1;
        if (eleCount > 0){
            val = stack[eleCount-1];
            eleCount--;
        }
        return val;
    }

    public void increment(int k, int val) {
        int len = Math.min(k,eleCount);
        for (int index = 0; index < len;index++){
            stack[index]+=val;
        }
    }
}
