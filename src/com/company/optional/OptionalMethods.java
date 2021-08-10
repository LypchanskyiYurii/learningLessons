package com.company.optional;

import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) {
        Optional<String> hello = Optional.ofNullable(null);

        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());

        String orElse = hello
                .map(String::toUpperCase)
                .orElseThrow(IllegalAccessError::new);
//                .orElseGet(() -> {
//                   // todo some logic
//                   return "world";
//                });
//                .orElse("World");
        System.out.println(orElse);
    }

}

