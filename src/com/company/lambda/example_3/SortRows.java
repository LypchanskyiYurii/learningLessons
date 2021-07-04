package com.company.lambda.example_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortRows {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list.add("ad");
        list.add("Goodbye");
        list.add("T");
        list.add("Hello");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }

            }
        });

        System.out.println(list);
        System.out.println("________________________");

        list2.add("Tom");
        list2.add("Bred");
        list2.add("Terminator");
        list2.add("BM");
        list2.add("W");
        Comparator<String> comparator = (s1, s2) -> {
            if (s1.length() > s2.length()) return 1;
            else if (s1.length() < s2.length()) return -1;
            else return 0;
        };
        list2.sort(comparator);
        System.out.println(list2);
    }

}
