package com.company;

public class Constructor {
    public static void main(String[] args) {
        PersonRobot person = new PersonRobot();
        System.out.println("__________________");
        PersonRobot person1 = new PersonRobot("Bob");
        System.out.println("__________________");
        PersonRobot person2 = new PersonRobot("Tom", 55);
    }

}

class PersonRobot {
    private String name;
    private int age;

    public PersonRobot () {
        System.out.println("Конструктор 1");
        this.name = "по замовчуванні";
        this.age = 0;
        System.out.println(name + " " + age);
    }
    public PersonRobot (String name) {
        System.out.println("Конструктор 2");
        this.name = name;
        System.out.println(name);
    }
    public PersonRobot (String name, int age) {
        System.out.println("Конструктор 3");
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }

}