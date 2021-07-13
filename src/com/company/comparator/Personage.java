package com.company.comparator;

public class Personage {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Personage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    protected Personage(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
