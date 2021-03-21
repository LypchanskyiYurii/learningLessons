package lessons36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/lessons36/Test");
        Scanner scn = new Scanner(file);
        while (scn.hasNextLine()) {
            System.out.println(scn.nextLine());
        }

        scn.close();
        System.out.println("___________________");

        File file1 = new File("src/lessons36/Test1");
        Scanner scn1 = new Scanner(file1);
        String line = scn1.nextLine();
        String[] numbersLine = line.split(" ");
        int counter = 0;
        int[] numbers = new int[5];

        for (String number : numbersLine) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbersLine));
        scn1.close();
    }
}
