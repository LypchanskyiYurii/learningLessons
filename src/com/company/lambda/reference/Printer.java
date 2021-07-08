package com.company.lambda.reference;

@FunctionalInterface
public interface Printer {

    void print(String msg);

    default void colorPrint(String msg) {
        System.out.println("Default method, message: " + msg);
    }

}
