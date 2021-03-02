package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введіть свій вік");
        int age = scn.nextInt();
        switch(age) {
            case 0 :
                System.out.println("Ти народився");
                break;
            case 7 :
                System.out.println("Ти пішов до школи");
                break;
            case 18 :
                System.out.println("Ти став повнолітнім!!!!");
                break;
            default:
                System.out.println("жодна умова не підійшла");
        }
    }
}
