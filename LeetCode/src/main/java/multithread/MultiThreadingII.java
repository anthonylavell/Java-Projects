package multithread;

public class MultiThreadingII {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++){
            MultiThreadThing myThing = new MultiThreadThing(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
            try {
                myThread.join();
            }catch (InterruptedException e){

            }

            //myThread.isAlive();
        }
    }
}
