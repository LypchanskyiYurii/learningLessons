package com.company.optional;

import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();

        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());
    }

}

