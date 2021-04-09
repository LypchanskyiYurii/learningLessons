package lessons45;

import java.io.*;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        Person person = new Person(5, "Tom");
        Person person1 = new Person(1, "Bob");

        FileOutputStream fos = new FileOutputStream("people.bin");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.writeObject(person1);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
