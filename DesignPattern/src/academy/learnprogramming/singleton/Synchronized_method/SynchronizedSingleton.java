package academy.learnprogramming.singleton.Synchronized_method;

public class SynchronizedSingleton {
    // the private reference to the one and only instance
    private static SynchronizedSingleton uniqueInstance = null;

    //an instance attribute
    private int data = 0;

    /*
        * The LazySingleton Constructor
        * Note that it is private!
        * No client can instantiate a LazySingleton object!
     */

    private SynchronizedSingleton(){}

    // by adding the synchronized keyword to getInstance(),
    // we force every thread to wait its turn turn before it  can
    //enter the method
    public static synchronized SynchronizedSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }

    public void setData(int myData){
        data = myData;
    }

    public int getData(){
        return data;
    }
}
