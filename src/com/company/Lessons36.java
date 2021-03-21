package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lessons36 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/com/company/Test";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
