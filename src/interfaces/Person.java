package interfaces;

public class Person implements Info {
    public String name;

    public Person (String name) {
        this.name = name;
    }
    public void sayHi () {
        System.out.println("Hello");
    }
    public void showInfo () {
        System.out.println("My name is " + this.name);
    }
}
