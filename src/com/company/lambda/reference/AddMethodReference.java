package com.company.lambda.reference;

public class AddMethodReference {
    public static void main(String[] args) {
        Printer printer = new Printer() {
            @Override
            public void print(String msg) {
                System.out.println(msg);
            }
        };
        printer.print("Hi");

        Printer lambdaPrinter = m -> System.out.println(m);
        lambdaPrinter.print("Hi lambda");

        Printer methodReferencePrinter = System.out::println;
        methodReferencePrinter.print("Method reference");
    }

    interface Printer {
        void print(String msg);
    }
}
