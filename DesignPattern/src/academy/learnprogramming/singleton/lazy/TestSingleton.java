package academy.learnprogramming.singleton.lazy;

public class TestSingleton {
    public static void main(String [] args){
        LazySingleton s = LazySingleton.getInstance();

        // set the data value
        s.setData(55);

        System.out.println("First reference: "+s);
        System.out.println("LazySingleton data value is: "+s.getData());

        // Get another reference to the LazySingleton.
        // Is it the same object?

        s = null;
        s = LazySingleton.getInstance();

        System.out.println("Second reference: "+s);
        System.out.println("LazySingleton data value is: "+s.getData());


    }
}
