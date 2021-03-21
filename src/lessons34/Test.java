package lessons34;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog(3));
        listOfDog.add(new Dog(4));

        test(listOfAnimals);
        test(listOfDog);



    }

        private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
            System.out.println(animal);

        }

    }
}
