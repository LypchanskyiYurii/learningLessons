package com.company.optional;

import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) {
        Person sergei = new Person("Serg", null);
        String email = sergei.getEmail()
                .map(String::toLowerCase)
                .orElse("Serg does not have email");

        System.out.println(email);

//        Optional<String> hello = Optional.ofNullable(null);
//
//        System.out.println(hello.isPresent());
//        System.out.println(hello.isEmpty());
//
//        hello.ifPresentOrElse(System.out::println, () -> System.out.println("world"));

//        String orElse = hello
//                .map(String::toUpperCase)
//                .orElseThrow(IllegalAccessError::new);
//                .orElseGet(() -> {
//                   // todo some logic
//                   return "world";
//                });
//                .orElse("World");
//        System.out.println(orElse);
    }

}

