package lessons45;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person = (Person) ois.readObject();
            Person person1 = (Person) ois.readObject();

            System.out.println(person);
            System.out.println(person1);
            ois.close();

            } catch (IOException | ClassNotFoundException e) {
                 e.printStackTrace();
        }



    }
}
