package academy.learnprogramming.singleton.eager_evaluation;

public class TestEagerSingleton {
    public static void main(String [] args){
        EagerSingleton s = EagerSingleton.getInstance();

        // set the data value
        s.setData(55);

        System.out.println("First reference: "+s);
        System.out.println("EagerSingleton data value is: "+s.getData());

        // Get another reference to the LazySingleton.
        // Is it the same object?

        s = null;
        s = EagerSingleton.getInstance();

        System.out.println("Second reference: "+s);
        System.out.println("EagerSingleton data value is: "+s.getData());


    }
}
