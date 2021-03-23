package lessons41;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();
        System.out.println("______________");
        dog.eat();
        cat.eat();
    }
}
