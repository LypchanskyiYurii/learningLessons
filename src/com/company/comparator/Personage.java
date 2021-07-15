package com.company.comparator;

import com.company.reflection.Author;

@Author(firstName = "Yurii", dateOfCreation = 2021)
public class Personage {
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

    public void sayHello() {
        System.out.println("com.company.comparator.Personage with id: " + id + " and name" + " says hello!");
    }

}
