package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введіть число");
        int myInt = scn.nextInt();
        System.out.printf("ви хер вже: %d", myInt);
    }
}
