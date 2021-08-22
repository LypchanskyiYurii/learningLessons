package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 1, 2, 3, 1, 2, 3);
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(list);
        System.out.println(list1);

        // Removing duplicates
        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);

        // Limit on the number of items
        List<Integer> limitList = list1.stream().limit(5).collect(Collectors.toList());
        System.out.println(limitList);

        // Skip the first elements
        List<Integer> skipList = list1.stream().skip(7).collect(Collectors.toList());
        System.out.println(skipList);

        //Terminal operations Stream API
        List<String> fruits = Stream.of("apple", "banana", "lemon", "orange").collect(Collectors.toList());
        System.out.println(fruits);

        //Iterating over elements
        list1.stream().forEach(System.out::println);

        //Counting the number of elements
        long countList = list1.stream().count();
        System.out.println("\n" + countList);
    }

}
