package com.company;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Вова";
        person1.age = 80;
        System.out.println("Мене звати " + person1.name + ", мені " + person1.age);

        Person person2 = new Person();
        person2.name = "Роман";
        person2.age = 30;
        System.out.println("Мене звати " + person2.name + ", мені " + person2.age);

    }
}

class Person {
    String name;
    int age;
}
