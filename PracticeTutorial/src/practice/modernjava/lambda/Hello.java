package practice.modernjava.lambda;

import practice.interfaces.IHello;

public class Hello {
    public static void main(String[] args) {
        String s = "Anthony";
        IHello helloMessage = (str) -> "Hello "+ str;
        System.out.println("helloMessage = " + helloMessage.message(s));
         helloMessage.message();
    }
}
