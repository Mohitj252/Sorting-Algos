package main.java;

/**
 * In bubble sort we will compare adjacent elements and swapped if they are not
 * in order. Once we will get swapped value as false we will stop the
 * comparision because after that no comparisons are required.
 * 
 * @author mohijain
 *
 */

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 10, 34, 2, 56, 7, 67, 88, 42 };

		for (int i = 0; i < array.length; i++) {
			boolean swapped = false;
			int temp = 0;
			for (int j = 1; j < array.length; j++) {

				if (array[j] < array[j - 1]) {

					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					swapped = true;

				}
			}

			if (swapped == false) {
				break;
			}
		}

		int i = 0;
		for (int sortedValues : array) {

			System.out.print(sortedValues);
			i = i + 1;
			if (i < array.length)

				System.out.print(",");

		}
	}
}
