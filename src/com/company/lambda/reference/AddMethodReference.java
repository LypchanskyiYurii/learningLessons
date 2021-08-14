package com.company.lambda.reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        Map<String, Printer> printerHub = new HashMap<>();
        printerHub.put("lambda", lambdaPrinter);
        printerHub.put("second", m -> {
            System.out.println("-=-=-");
            System.out.println(m);
            System.out.println("-=-=-");
        });
        printerHub.get("second").print("Hello");

        List<String> names = Arrays.asList("John", "James", "Steve", "Andrew");
        names.stream().forEach(System.out::println);
        System.out.println("_________________________________");
        names.stream().filter(n -> n.startsWith("J")).forEach(System.out::println);
        System.out.println();

        names.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("_________________________________");

        printerHub.get("lambda").colorPrint("Test");

        // Element access
        names.stream().peek(System.out::println);
        System.out.println(names);
    }

 }
