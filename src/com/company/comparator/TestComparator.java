package com.company.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        animals.add("sdlaldk");
        animals.add("Dog");
        animals.add("Frog");
        animals.add("Cat");
        animals.add("sd");
        animals.add("Bird");
        animals.add("d");

        Collections.sort(animals, (o1, o2) -> {
            if (o1.length() > o2.length())
                return 1;
            else if (o1.length() < o2.length())
                return -1;
            else return 0;
        });
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1000);
        numbers.add(0);
        numbers.add(54);
        numbers.add(101);

        Collections.sort(numbers, (o1, o2) -> {
            if (o1 > o2)
                return -1;
            else if (o1 < o2)
                return 1;
            else return 0;
        });
        System.out.println(numbers);
    }

}
