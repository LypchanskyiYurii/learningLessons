package com.company.stream;

public class Specialist {
    private String name;
    private int salary;
    private Specialty Specialty;

    public Specialist(String name, int salary, com.company.stream.Specialty specialty) {
        this.name = name;
        this.salary = salary;
        Specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public com.company.stream.Specialty getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(com.company.stream.Specialty specialty) {
        Specialty = specialty;
    }

    @Override
    public String toString() {
        return "Specialist{" +
                "name = '" + name + '\'' +
                ", salary = " + salary + ", specialty = " + Specialty + "}";
    }

}
