package multithread.extend;
class MyThread extends Thread {
    // initiated run method for thread
    public void run() {
        String str = "Thread Started Running....";
        System.out.println(str);
    }
}
public class GeeksExtending {
    static void main() {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
