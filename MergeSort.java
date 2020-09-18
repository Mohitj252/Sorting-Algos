package main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Java Program to Implement Merge Sort
 * 
 */

/* Class MergeSort */
public class MergeSort {
	/* Merge Sort function */
	
	private static int[] numbers;
    private static int[] helper;
    
    private static int number;

    
    public static void sort(int[] values) {
        numbers = values;
        number = values.length;
        helper = new int[number];
        mergesort(0, number - 1);
}
	
	private static void mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
                // Get the index of the element which is in the middle
                int middle = low + (high - low) / 2;
                // Sort the left side of the array
                mergesort(low, middle);
                // Sort the right side of the array
                mergesort(middle + 1, high);
                // Combine them both
                merge(low, middle, high);
        }
}
	
	private static void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
                helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        
        
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
                if (helper[i] <= helper[j]) {
                        numbers[k] = helper[i];
                        i++;
                } else {
                        numbers[k] = helper[j];
                        j++;
                }
                k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
                numbers[k] = helper[i];
                k++;
                i++;
        }

}

	/* Main method */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Merge Sort Test\n");
		int n, i;
		/* Accept number of elements */
		System.out.println("Enter number of integer elements");
		n = scan.nextInt();
		/* Create array of n elements */
		int arr[] = new int[n];
		/* Accept elements */
		System.out.println("\nEnter " + n + " integer elements");
		for (i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		/* Call method sort */
		sort(arr);
		/* Print sorted Array */
		System.out.println("\nElements after sorting ");
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
