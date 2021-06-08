package com.company.pattern;

public class ShowBox {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10; k++) {
                if (i == 1 || i == 10 || k == 1 || k == 10)
                    System.out.print(" 1");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
