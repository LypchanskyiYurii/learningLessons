package com.company;

public class Arrays {
    public static void main(String[] args) {
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++){
            num[i] = i * 10;
            System.out.println(num[i]);
        }
        System.out.println();
        int[] num1 = {1,2,3,4,5};
        for (int i = 0; i< num1.length; i++){
            System.out.println(num1[i]);
        }
    }
}
