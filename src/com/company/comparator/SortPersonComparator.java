package com.company.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPersonComparator {
    public static void main(String[] args) {
        List<Personage> people = new ArrayList<>();
        people.add(new Personage(67, "Tom"));
        people.add(new Personage(15, "Brad"));
        people.add(new Personage(100, "Bob"));

        Collections.sort(people, (o1, o2) -> {
            if (o1.getId() > o2.getId()) {
                return 1;
            } else if (o1.getId() < o2.getId()) {
                return -1;
            } else return 0;
        });
        System.out.println(people);
    }

}
