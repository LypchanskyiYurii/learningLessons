package com.company;

public class Lessons_19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(20);
        human1.setName("Bob");
        human1.getInfo();
        System.out.println("____________________________________");
        human1.setAge(55);
        human1.setName("Tom");
        human1.getInfo();
    }
}

class Human {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void getInfo() {
        System.out.println(name + " " + age);
    }
}
