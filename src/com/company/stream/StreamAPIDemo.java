package com.company.stream;

import java.util.List;
import java.util.Map;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Specialist> specialists = StreamAPI.getSpecialists();
//        System.out.println(specialists);

//        // Filter
//        List<Specialist> engineers = StreamAPI.filterBySpecialist(specialists, Specialty.ENGINEER);
//        System.out.println(engineers);

        // Sorting
//        List<Specialist> sortedSpecialistsAsc = StreamAPI.sortSpecialistsByNameAsc(specialists);
//        System.out.println(sortedSpecialistsAsc);
//        List<Specialist> sortedSpecialistsDesc = StreamAPI.sortSpecialistsByNameDesc(specialists);
//        System.out.println(sortedSpecialistsDesc);

        // Max and min salary
//        Specialist withMaxSalary = StreamAPI.findWithMaxSalary(specialists);
//        System.out.println(withMaxSalary);
//        Specialist withMinSalary = StreamAPI.findWithMinSalary(specialists);
//        System.out.println(withMinSalary);

        // Grouping
//        Map<Specialty, List<Specialist>> groupedBySpecialty = StreamAPI.groupBySpecialty(specialists);
//        System.out.println(groupedBySpecialty);

        // All engineers
        boolean allEngineers = StreamAPI.matchAllEngineers(specialists);
        System.out.println(allEngineers);

    }

}
