package com.company.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {
    // adding elements to the list
    public static List<Specialist> getSpecialists() {
        return List.of(
                new Specialist("Ivan", 6000, Specialty.MANAGER),
                new Specialist("Petro", 10000, Specialty.ENGINEER),
                new Specialist("Mukola", 4000, Specialty.DEVOPS),
                new Specialist("Alex", 15000, Specialty.MANAGER),
                new Specialist("Olya", 7500, Specialty.ENGINEER),
                new Specialist("Yurii", 15100, Specialty.DEVOPS)
        );
    }

    // looking for specialists
    public static List<Specialist> filterBySpecialist(List<Specialist> specialists, Specialty specialty) {
        return specialists.stream()
                .filter(specialist -> specialist.getSpecialty().equals(specialty))
                .collect(Collectors.toList());
    }

    // sort by name in ascending order
    public static List<Specialist> sortSpecialistsByNameAsc(List<Specialist> specialists) {
        return specialists.stream()
                .sorted(Comparator.comparing(Specialist::getName))
                .collect(Collectors.toList());
    }

    // sort by name in descending order
    public static List<Specialist> sortSpecialistsByNameDesc(List<Specialist> specialists) {
        return specialists.stream()
                .sorted(Comparator.comparing(Specialist::getName).reversed())
                .collect(Collectors.toList());
    }

    // search for a specialist with the maximum salary
    public static Specialist findWithMaxSalary(List<Specialist> specialists) {
        return specialists.stream().max(Comparator.comparing(Specialist::getSalary)).orElse(null);
    }

    // search for a specialist with the min salary
    public static Specialist findWithMinSalary(List<Specialist> specialists) {
        return specialists.stream().min(Comparator.comparing(Specialist::getSalary)).orElse(null);
    }

    // grouping by specialists of the specialty
    public static Map<Specialty, List<Specialist>> groupBySpecialty(List<Specialist> specialists) {
        return specialists.stream().collect(Collectors.groupingBy(Specialist::getSpecialty));
    }

    // check match matching all engineers
    public static boolean matchAllEngineers(List<Specialist> specialists) {
        return specialists.stream().allMatch(specialist -> specialist.getSpecialty().equals(Specialty.ENGINEER));
    }

    // match check whether there are engineers
    public static boolean matchAnyEngineers(List<Specialist> specialists) {
        return specialists.stream().anyMatch(specialist -> specialist.getSpecialty().equals(Specialty.ENGINEER));
    }

}


