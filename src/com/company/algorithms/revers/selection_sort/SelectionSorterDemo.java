package com.company.algorithms.revers.selection_sort;

import java.util.Arrays;

public class SelectionSorterDemo {

    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {0, 6, 2, 10, 3, 2},
                {9, 1, 200, 4, 12, 0, 2, 1, 100, 56, 43, 23, 12, 3, 5, 6},
        };

        for (int[] array : data) {
            System.out.print(Arrays.toString(array) + " => ");
            SelectionSorter.sortChoice(array);
            System.out.println(Arrays.toString(array));
        }
    }

}
