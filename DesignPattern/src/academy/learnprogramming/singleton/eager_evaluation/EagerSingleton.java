package academy.learnprogramming.singleton.eager_evaluation;

public class EagerSingleton {
    // the private reference to the one and only instance
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    //an instance attribute
    private int data = 0;

    /*
        * The LazySingleton Constructor
        * Note that it is private!
        * No client can instantiate a LazySingleton object!
     */

    private EagerSingleton(){}

    // by adding the synchronized keyword to getInstance(),
    // we force every thread to wait its turn turn before it  can
    //enter the method
    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }

    public void setData(int myData){
        data = myData;
    }

    public int getData(){
        return data;
    }
}
