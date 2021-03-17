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
        Animal animal2 = dog1;

      Dog dog2 = (Dog)animal2;
      dog2.bark();
        System.out.println("_______________");
    }
}
