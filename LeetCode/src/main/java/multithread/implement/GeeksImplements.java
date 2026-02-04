package multithread.implement;

class MyThread implements Runnable{
    // Method to start Thread
    public void run(){
        String str = "Thread is Running Successfully";
        System.out.println(str);
    }
}

public class GeeksImplements {
    static void main() {
        MyThread g1 = new MyThread();
        // initializing Thread Object
        Thread t1 = new Thread(g1,"tony");

        // Running Thread
        t1.start();

        System.out.println(t1.getName());
        System.out.println(t1.currentThread().getName());
    }
}
