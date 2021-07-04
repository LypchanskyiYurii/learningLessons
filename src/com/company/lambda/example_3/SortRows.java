package com.company.lambda.example_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortRows {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("ad");
        list.add("Goodbye");
        list.add("T");
        list.add("Hello");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                }
                if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }

            }
        });

        System.out.println(list);
    }

}
