package ua.com.yurii.writeAndReadFile;

import lessons45.Person;

import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("archive.bin"))){

            Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
