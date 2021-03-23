package lessons42;

public class Test {
    public static void main(String[] args) {
    Animal animal = new Animal(1);
    Animal animal1 = new Animal(1);
        System.out.println(animal.equals(animal1));
    }
}

class Animal {
    private int id;

    public Animal (int id) {
        this.id = id;
    }


    public boolean equals (Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}