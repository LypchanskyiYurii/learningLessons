package com.company.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class POJO {
    public static void main(String[] args) {

        List<String> medicinesOnline = List.of("Askorbinka", "Nazonex", "Dekatylen", "Strepsils", "Zelenka");

        List<String> zi = List.of("Nazonex", "Vitamin C", "Advil", "Doppel Herz");

        List<String> DS = List.of("Vitamin C", "Advil", "Doppel Herz");

        List<String> Kopiiochka = List.of("Ibuprofen", "Vitamin C");



        List<String> allUniqueMedicines;
        allUniqueMedicines = Stream.of(medicinesOnline, zi, DS,Kopiiochka)
                .flatMap(x -> x.stream())
                .distinct().sorted()
                .collect(Collectors.toList());

        allUniqueMedicines.stream().forEach(System.out::println);
    }
}
