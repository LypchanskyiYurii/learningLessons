package com.company.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class POJO {
    public static void main(String[] args) {

        List<String> medicinesOnline = List.of("Askorbinka", "Nazonex", "Dekatylen", "Strepsils", "Zelenka");

        List<Pharmacy> pharmacies = List.of(
                new Pharmacy("3i", List.of("Nazonex", "Vitamin C", "Zn Supplements")),
                new Pharmacy("DS", List.of("Vitamin C", "Advil", "Doppel Herz")),
                new Pharmacy("Kopiiochka", List.of("Ibuprofen", "Vitamin C")));

        List<String> collect = pharmacies.stream()
                .flatMap(value -> value.getMedicine().stream()).distinct()
                .collect(Collectors.toList());

        collect.addAll(medicinesOnline);

        collect.stream().distinct().sorted().forEach(System.out::println);

    }
}

class Pharmacy {
    private String name;
    private List<String> medicine;

    public Pharmacy(String name, List<String> medicine) {
        this.name = name;
        this.medicine = medicine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMedicine() {
        return medicine;
    }

    public void setMedicine(List<String> medicine) {
        this.medicine = medicine;
    }

    public static List<Pharmacy> getAll() {
        return List.of(
                new Pharmacy("3i", List.of("Nazonex", "Vitamin C", "Zn Supplements")),
                new Pharmacy("DS", List.of("Vitamin C", "Advil", "Doppel Herz")),
                new Pharmacy("Kopiiochka", List.of("Ibuprofen", "Vitamin C")));
    }
}