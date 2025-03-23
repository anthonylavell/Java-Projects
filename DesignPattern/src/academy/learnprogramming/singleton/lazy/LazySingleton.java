package academy.learnprogramming.singleton.lazy;

public class LazySingleton {
    // the private reference to the one and only instance
    private static LazySingleton uniqueInstance = null;

    //an instance attribute
    private int data = 0;

    /*
        * The LazySingleton Constructor
        * Note that it is private!
        * No client can instantiate a LazySingleton object!
     */

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
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
