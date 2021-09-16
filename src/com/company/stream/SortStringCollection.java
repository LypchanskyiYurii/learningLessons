package com.company.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStringCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");

//        Stream stream = list.stream();
//        stream.filter(x-> x.toString().length() == 3).forEach(System.out::println);
//        list.stream().sorted().forEach(x -> System.out.println(x));

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        list2.add("6");
        list2.add("7");
        list2.add("8");
        list2.add("9");
        list2.add("10");

//        List<String> newList = Stream.of(list, list2).flatMap(Collection::stream).collect(Collectors.toList());
//        System.out.println(newList);

        Stream<String> stringStream = Stream.of("1", "2", "3", "4", "5");
        Stream<String> stringStream1 = Stream.of("6", "7", "8", "9", "10");

        Stream<String> concat = Stream.concat(stringStream, stringStream1);
        System.out.println(concat.collect(Collectors.toList()));
    }
}
