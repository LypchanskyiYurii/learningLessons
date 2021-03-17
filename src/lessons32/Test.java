package lessons32;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.eat();
        dog.bark();
        dog.eat();
        System.out.println("_______________");
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Animal an = new Dog();

        dog1 = (Dog)animal1;  // can't be transform
        dog1.eat();
        dog1.bark();
        System.out.println("_______________");
    }
}
