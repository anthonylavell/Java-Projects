package multithread;

public class MultiThreadThing extends Thread{
    private int threadNum;

    public MultiThreadThing(int threadNum){
        this.threadNum = threadNum;
    }
    @Override
    public void run(){
        for (int i = 1; i <=5; i++){
            System.out.println(i + " from thread: " + threadNum);
            if(threadNum == 3){
                throw  new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
            }
        }
    }
}
