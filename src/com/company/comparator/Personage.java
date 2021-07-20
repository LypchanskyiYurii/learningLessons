package com.company.comparator;

import com.company.reflection.Author;

import java.util.Objects;

@Author(firstName = "Yurii", dateOfCreation = 2021)
public class Personage implements Comparable<Personage> {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "com.company.comparator.Personage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Personage() {
        this.id = -1;
        this.name = "No name";
    }

    protected Personage(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personage)) return false;
        Personage personage = (Personage) o;
        return getId() == personage.getId() && getName().equals(personage.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    public void sayHello() {
        System.out.println("com.company.comparator.Personage with id: " + id + " and name" + " says hello!");
    }

    @Override
    public int compareTo(Personage o) {
        if (this.id > o.getId()) {
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        } else return 0;
    }

}
