package com.company;

public class Multimensinal_Arrays {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3}, {6, 5, 4}, {8, 1, 4}, {10}, {12, 14}};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(num[3][0]);
        System.out.println(num[1][1]);
        System.out.println(num[2][0]);
    }
}
