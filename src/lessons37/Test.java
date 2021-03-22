package lessons37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }


        public static void readFile() throws FileNotFoundException {
            File file = new File("ewqe");
            Scanner scanner = new Scanner(file);
        }

}
