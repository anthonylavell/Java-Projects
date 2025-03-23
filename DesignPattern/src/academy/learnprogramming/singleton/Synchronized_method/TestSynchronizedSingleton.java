package academy.learnprogramming.singleton.Synchronized_method;

public class TestSynchronizedSingleton {
    public static void main(String [] args){
        SynchronizedSingleton s = SynchronizedSingleton.getInstance();

        // set the data value
        s.setData(55);

        System.out.println("First reference: "+s);
        System.out.println("LazySingleton data value is: "+s.getData());

        // Get another reference to the LazySingleton.
        // Is it the same object?

        s = null;
        s = SynchronizedSingleton.getInstance();

        System.out.println("Second reference: "+s);
        System.out.println("LazySingleton data value is: "+s.getData());


    }
}
