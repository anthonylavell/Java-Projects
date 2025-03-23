package academy.learnprogramming.singleton.bill_pugh;

public class TestBillPughSingleton {
    public static void main(String [] args){
        BillPughSingleton s = BillPughSingleton.getInstance();

        // set the data value
        s.setData(55);

        System.out.println("First reference: "+s);
        System.out.println("BillPughSingletonSingleton data value is: "+s.getData());

        // Get another reference to the LazySingleton.
        // Is it the same object?

        s = null;
        s = BillPughSingleton.getInstance();

        System.out.println("Second reference: "+s);
        System.out.println("BillPughSingletonSingleton data value is: "+s.getData());


    }
}
