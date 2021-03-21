package lessons34;

public class Dog extends Animal {
    private int id;
    public Dog(int id) {
        this.id = id;
    }

    public String toString () {
        return String.valueOf(id);
    }

}
