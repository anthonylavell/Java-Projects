package practice.interfaces;

public interface IHello {
    public String message(String str);
    public default void message(){
        System.out.println("Hello World");
    }
}
