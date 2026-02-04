package multithread.lambda;

public class GeeksLambda {
    static void main() {
        Thread thread1= new Thread(()->{
            System.out.println("Lambda Thread running");
        });
        thread1.start();
    }
}
