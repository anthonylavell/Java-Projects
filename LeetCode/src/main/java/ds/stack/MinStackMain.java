package ds.stack;

public class MinStackMain {
    public static void main(String[] args) {
       MinStackI stack = new MinStackI();
       stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.getMin());
    }
}
