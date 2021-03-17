package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lessons33 {
    public static void main(String[] args) {
        //////////////////// до 5 Java  //////////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("shark");
        String animal = (String) animals.get(1);
        System.out.println(animal);
        System.out.println("______________________");
        //////////////////// Java 8 < /////////////////

        List<String> animals1 = new ArrayList<>();
        animals1.add("cat");
        animals1.add("dog");
        animals1.add("shark");
        System.out.println(animals1.get(2));
    }
}
