package com.company.stream;

import java.util.List;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Specialist> specialists = StreamAPI.getSpecialists();
        System.out.println(specialists);

        // Filter
        List<Specialist> engineers = StreamAPI.filterBySpecialist(specialists, Specialty.ENGINEER);
        System.out.println(engineers);
    }

}