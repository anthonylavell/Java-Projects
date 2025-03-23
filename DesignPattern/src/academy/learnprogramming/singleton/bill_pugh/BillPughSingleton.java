package academy.learnprogramming.singleton.bill_pugh;

public class BillPughSingleton {
    //an instance attribute
    private int data = 0;

    /*
        * The LazySingleton Constructor
        * Note that it is private!
        * No client can instantiate a LazySingleton object!
     */

    private BillPughSingleton(){}

    private static class SingletonHelper{
       // Nest class is reference after getInstance() is called
       private static final BillPughSingleton uniqueInstance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    public void setData(int myData){
        data = myData;
    }

    public int getData(){
        return data;
    }
}
