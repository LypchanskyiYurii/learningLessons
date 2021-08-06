package com.company.lambda.reference;

import java.util.function.IntUnaryOperator;

public class MethodReferenceExamples {
    public static void main(String[] args) {
        printAbsUsingMethodReference(-23);

    }
    private static void printAbsUsingMethodReference(int a) {
        IntUnaryOperator absOperator = Math::abs;
        int result = absOperator.applyAsInt(a);

        System.out.println("abs(" + a + ") = " + result);
    }

}
