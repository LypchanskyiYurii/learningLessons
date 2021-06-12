package com.company.pattern;

public class AlphabeticTriangle {
    public static void main(String[] args) {
        int alphabet = 65;
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
    }
}
