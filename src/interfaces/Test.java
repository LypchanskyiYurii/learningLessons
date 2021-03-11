package interfaces;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(45);
        Info info2 = new Person("Bob");

        Animal animal1 = new Animal(23);
        Person person1 = new Person("Tom");
        animal1.sleep();
        animal1.showInfo();
        person1.showInfo();
        System.out.println("__________________");
        outputInfo(animal1);
        info2.showInfo();
        info1.showInfo();
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
