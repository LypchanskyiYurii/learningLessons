package com.company.algorithms.revers.selection_sort;

public class SelectionSorter {

    public static void sortChoice(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            int minValue = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    index = j;
                    minValue = array[j];
                }
            }
            array[index] = array[i];
            array[i] = minValue;
        }
    }

}
