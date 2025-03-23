package multithread;

public class MultiThreading {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++){
            MultiThreadThing myThing = new MultiThreadThing(i);
            myThing.start();
        }
    }
}
