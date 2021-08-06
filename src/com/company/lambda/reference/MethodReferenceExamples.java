package com.company.lambda.reference;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class MethodReferenceExamples {
    public static void main(String[] args) {
        printAbsUsingMethodReference(-23);
        printSumUsingMethodReference(25,50);

    }

    private static void printAbsUsingMethodReference(int a) {
        IntUnaryOperator absOperator = Math::abs;
        int result = absOperator.applyAsInt(a);

        System.out.println("abs(" + a + ") = " + result);
    }

    private static void printSumUsingMethodReference(int a, int b) {
        IntBinaryOperator sumOperator = Math::addExact;
        int result = sumOperator.applyAsInt(a, b);

        System.out.println("\n" + a + " + " + b + " = " + result);
    }


}
