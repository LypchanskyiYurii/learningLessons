package lessons45.algorithms.revers;

import java.util.Arrays;

public class ArrayInvertDemo {

    public static void main(String[] args) {
        testInvert(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    private static void testInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        ArrayInverter.invert(array);
        System.out.println(Arrays.toString(array));
    }

}
