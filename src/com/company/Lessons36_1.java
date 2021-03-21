package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lessons36_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/company/Test1");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersLIne = line.split(" ");
        int[] numbers = new int[8];
        int counter = 0;
        for (String number : numbersLIne) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbersLIne));
        scanner.close();
    }
}
