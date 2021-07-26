package com.company.stream;

import java.util.List;

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

}
