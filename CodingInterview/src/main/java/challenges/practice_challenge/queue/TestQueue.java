package challenges.practice_challenge.queue;

import challenges.practice_challenge.stack.IStack;

public class TestQueue {
    public static void main(String[] args) {
        //IQueue challenges.practice_challenge.queue = new LinkedListQueue();

        /*challenges.practice_challenge.queue.enqueue(35);
        challenges.practice_challenge.queue.enqueue(11);
        challenges.practice_challenge.queue.enqueue(21);

        System.out.println(challenges.practice_challenge.queue.peek()+" First");
        challenges.practice_challenge.queue.dequeue();
        System.out.println(challenges.practice_challenge.queue.dequeue());
        System.out.println(challenges.practice_challenge.queue.peek());
        challenges.practice_challenge.queue.dequeue();
        System.out.println(challenges.practice_challenge.queue.peek());
        System.out.println(challenges.practice_challenge.queue.dequeue());*/

        IStack obj = new MyQueue();
        obj.push(35);
        obj.push(11);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        obj.pop();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
        System.out.println(obj.empty());




    }


}
