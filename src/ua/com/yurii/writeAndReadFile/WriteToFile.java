package ua.com.yurii.writeAndReadFile;

import lessons45.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteToFile {
    public static void main(String[] args) {
        Person person = new Person(45, "Tom");


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("archive.bin"))){
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
