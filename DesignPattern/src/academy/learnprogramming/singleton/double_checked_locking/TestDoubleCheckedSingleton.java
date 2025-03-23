package academy.learnprogramming.singleton.double_checked_locking;

public class TestDoubleCheckedSingleton {
    public static void main(String [] args){
        DoubleCheckedSingleton s = DoubleCheckedSingleton.getInstance();

        // set the data value
        s.setData(55);

        System.out.println("First reference: "+s);
        System.out.println("DoubleCheckedSingleton data value is: "+s.getData());

        // Get another reference to the LazySingleton.
        // Is it the same object?

        s = null;
        s = DoubleCheckedSingleton.getInstance();

        System.out.println("Second reference: "+s);
        System.out.println("DoubleCheckedSingleton data value is: "+s.getData());


    }
}
