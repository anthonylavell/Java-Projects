package challenges.practice_challenge.stack;

public class TestStack {

    public static void main(String[] args) {
        /*LinkedLinkStack challenges.practice_challenge.stack = new LinkedLinkStack();
        challenges.practice_challenge.stack.push(35);
        challenges.practice_challenge.stack.push(14);
        challenges.practice_challenge.stack.push(11);
        System.out.println(challenges.practice_challenge.stack.peek());
        System.out.println(challenges.practice_challenge.stack.pop());
        System.out.println(challenges.practice_challenge.stack.peek());
        challenges.practice_challenge.stack.pop();
        System.out.println(challenges.practice_challenge.stack.pop());
        System.out.println(challenges.practice_challenge.stack.peek());*/

        IStack stack = new ArrayStack();
        stack.push(35);
        stack.push(14);
        stack.push(11);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
