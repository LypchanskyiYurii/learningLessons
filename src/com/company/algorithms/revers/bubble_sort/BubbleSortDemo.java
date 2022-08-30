package com.company.algorithms.revers.bubble_sort;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {

		int[][] data = {
				{},
				{1},
				{0, 6, 2, 10, 3, 2},
				{9, 1, 200, 4, 12, 0, 2, 1},
		};

		for (int[] array: data) {
			System.out.print(Arrays.toString(array) + " => ");
			BubbleSort.sort(array);
			System.out.println(Arrays.toString(array));
		}
	}

}
