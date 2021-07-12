package com.company.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        animals.add("Dog");
        animals.add("Frog");
        animals.add("Cat");
        animals.add("Bird");

        Collections.sort(animals);
        System.out.println(animals);
    }

}
