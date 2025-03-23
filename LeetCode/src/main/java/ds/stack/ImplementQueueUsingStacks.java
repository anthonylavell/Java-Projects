package ds.stack;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    Stack<Integer> mainStack;
    public ImplementQueueUsingStacks() {
        mainStack = new Stack<>();
    }
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        boolean isTorF = stack.empty();
        ImplementQueueUsingStacks stacks =new ImplementQueueUsingStacks();
        stacks.push(0);
        stacks.push(1);
        stacks.push(2);
        stacks.peek();
        int i = stacks.pop();
        System.out.println(i);
    }

    public void push(int x) {
        if(mainStack.empty()){
            mainStack.push(x);
        }else {
            Stack<Integer> secondStack = new Stack<>();
            toMainStack(mainStack,secondStack);
            mainStack.push(x);
            toMainStack(secondStack,mainStack);
        }
    }


    private void toMainStack(Stack stack, Stack stack2){
        while(!stack.empty()){
           stack2.push(stack.pop());
        }
    }

    public int pop() {
        return mainStack.pop();
    }

    public int peek() {
        return mainStack.peek();
    }

    public boolean empty() {
       return mainStack.empty();
    }
}
