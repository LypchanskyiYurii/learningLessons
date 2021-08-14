package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 1, 2, 3, 1, 2, 3);
        System.out.println(list);

        // Removing duplicates
        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);

        // Limit on the number of items
        List<Integer> limitList = list.stream().limit(5).collect(Collectors.toList());
        System.out.println(limitList);
    }

}
