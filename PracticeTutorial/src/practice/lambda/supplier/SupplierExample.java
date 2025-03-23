package practice.lambda.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer>supplier = (() -> 100);
    }
}
