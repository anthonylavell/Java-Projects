package com.modernjava.optinal;

import java.util.Optional;

public class OptionalIfIsExample {
    public static void main(String[] args) {
        //isPresent
        Optional<String> stringOptional = Optional.ofNullable("Hello World");
        if(stringOptional.isPresent())
            System.out.println("stringOptional = "+stringOptional.get());

        stringOptional.ifPresent(s -> System.out.println("s = "+s));
    }
}
