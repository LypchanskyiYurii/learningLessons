package com.company.interfaces;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(45);
        Info info2 = new Figure("Bob");

        Animal animal1 = new Animal(23);
        Figure figure1 = new Figure("Tom");
        animal1.sleep();
        animal1.showInfo();
        figure1.showInfo();
        System.out.println("__________________");
        outputInfo(animal1);
        info2.showInfo();
        info1.showInfo();
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
