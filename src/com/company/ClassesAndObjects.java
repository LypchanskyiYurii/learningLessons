package com.company;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Вова";
        person1.age = 80;
        person1.speak();
        person1.sayHello();

        System.out.println("___________________________________");
        Person person2 = new Person();
        person2.name = "Роман";
        person2.age = 30;
        person2.speak();
        person2.sayHello();

    }
}

class Person {
    String name;
    int age;
    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Мене звати " + name + ", мені " + age);
        }
    }
    void sayHello() {
            System.out.println("Привіт всім!!!");
        }
}

