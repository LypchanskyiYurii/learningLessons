package com.company.interfaces;

import java.util.Objects;

public class Figure {
    private String name;
    private int id;

    public Figure(int id) {
        this.id = id;
    }

    public Figure(String name) {
        this.name = name;
    }

    public void sayHi () {
        System.out.println("Hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return id == figure.id && Objects.equals(name, figure.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public void showInfo () {
        System.out.println("My name is " + this.name);
    }

}
