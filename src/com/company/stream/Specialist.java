package com.company.stream;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specialist that = (Specialist) o;
        return salary == that.salary && Objects.equals(name, that.name) && Specialty == that.Specialty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, Specialty);
    }
}
