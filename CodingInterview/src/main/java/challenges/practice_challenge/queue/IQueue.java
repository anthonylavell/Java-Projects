package challenges.practice_challenge.queue;

public interface IQueue {
    boolean isEmpty();
    void enqueue(int data);
    int peek();
    int dequeue();
}
