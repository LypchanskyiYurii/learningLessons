package com.company.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 1, 2, 3, 1, 2, 3);
        System.out.println(list);

        // Removing duplicates
        list.stream().distinct().forEach(System.out::println);
    }

}
