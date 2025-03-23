package com.modernjava;

import java.util.function.Supplier;
import static java.lang.System.*;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 1000);
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        out.println("hello");
    }
}