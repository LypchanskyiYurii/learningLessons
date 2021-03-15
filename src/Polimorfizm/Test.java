package Polimorfizm;

public class Test {
    public static void main(String[] args) {
    Animal animal2 = new Cat();
    Animal animal = new Animal();
    Cat cat = new Cat();
    Dog dog = new Dog();
    canEat(animal);
    canEat(cat);
    canEat(dog);
        System.out.println("__________________");
        canRun(animal);
        canRun(cat);
        canRun(dog);
        System.out.println("__________________");
        canRun(animal2);
        cat.canVoice();

    }
    public static void canEat (Animal animal) {
        animal.eat();
    }
    public static void canRun (Animal animal) {
        animal.run();
    }
}
