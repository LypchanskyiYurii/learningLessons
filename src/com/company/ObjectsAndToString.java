package com.company;

public class ObjectsAndToString {
    public static void main(String[] args) {
        Human h2 = new Human("Tom", 43);
        Human h1 = new Human("Bob", 63);
        System.out.println(h2.toString());

        System.out.println("_______________");
        Human.description = "Nice";
        Human.getDescription();
        System.out.println("_______________");
        h1.printNumberOfPeople();

    }

    static class Human {
        private String name;
        private int age;
        public static String description;
        private static int countPeople;

        public Human(String name, int age){
            this.name = name;
            this.age = age;
            countPeople++;
        }

        public Human() {

        }
         public String toString() {
            return name + ", " + age;
        }
        public static void getDescription() {
            System.out.println(description);
        }
        public void printNumberOfPeople(){
            System.out.println("Number of people " + countPeople);
        }

    }
}
