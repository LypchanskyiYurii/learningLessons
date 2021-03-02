package com.company;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Вова";
        person1.age = 55;
        person1.speak();
        person1.sayHello();
        int years1 = person1.calculateYearsRetirement();
        System.out.println("Мені залишилось до пенсї " + years1);

        System.out.println("___________________________________");
        Person person2 = new Person();
        person2.name = "Роман";
        person2.age = 30;
        person2.speak();
        person2.sayHello();
        int years2 = person2.calculateYearsRetirement();
        System.out.println("Мені залишилось до пенсї " + years2);

    }
}

class Person {
    String name;
    int age;

    int calculateYearsRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Мене звати " + name + ", мені " + age);
        }
    }

    void sayHello() {
            System.out.println("Привіт всім!!!");
        }
}

