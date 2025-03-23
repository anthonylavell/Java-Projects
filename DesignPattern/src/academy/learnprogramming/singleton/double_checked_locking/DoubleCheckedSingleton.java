package academy.learnprogramming.singleton.double_checked_locking;

public class DoubleCheckedSingleton {
    // the private reference to the one and only instance
    private volatile static DoubleCheckedSingleton uniqueInstance = null;

    //an instance attribute
    private int data = 0;

    /*
        * The LazySingleton Constructor
        * Note that it is private!
        * No client can instantiate a LazySingleton object!
     */

    private DoubleCheckedSingleton(){}

    // by adding the synchronized keyword to getInstance(),
    // we force every thread to wait its turn turn before it  can
    //enter the method
    public static DoubleCheckedSingleton getInstance() {
        if(uniqueInstance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedSingleton();
                }
            }
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
