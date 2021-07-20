package com.company.comparator;

import java.util.*;

public class SortComparable {
    public static void main(String[] args) {
        List<Personage> peopleList = new ArrayList<>();
        Set<Personage> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    private static void addElements(Collection collection) {
        collection.add(new Personage(3, "Tom"));
        collection.add(new Personage(4, "Bob"));
        collection.add(new Personage(1, "George"));
        collection.add(new Personage(2, "Katy"));
    }

}
