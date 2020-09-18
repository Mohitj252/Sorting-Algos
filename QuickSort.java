package main.java;

import java.util.Scanner;

public class QuickSort {
	
	//public static int [] unSortedArray;

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the array size");

		int input = scanner.nextInt();

		int [] unSortedArray = new int[input];
		
		System.out.println("enter the array input values");

		for (int i = 0; i < unSortedArray.length; i++) {

			unSortedArray[i] = scanner.nextInt();
		}

		int arrayLength = unSortedArray.length;
		quickSort(unSortedArray, 0, arrayLength);
		
		for(int sortedElements : unSortedArray){
			System.out.print(sortedElements);
			System.out.print(",");
		}

	}

	public static void quickSort(int[] temp_array, int p, int r) {
		//temp_array = temp_array;
		System.out.println("values of p and r inside quickSort method....." +p+"..."+r);
		if(p < r){
			int q = partition(temp_array, p, r);
			quickSort(temp_array, p, q - 1);
			quickSort(temp_array, q + 1, r);
	
		}
		
	}
	
	public static int partition(int[] temp_array, int p, int r){
		
		int x = temp_array[r -1];
		int i = p-1;
		int temp;
		for (int j = p; j<r-1; j++){
			
			if (temp_array[j]<=x){
				
				i = i+1;
				// swapping i and jth position data
				temp = temp_array[j];
				temp_array[j] = temp_array[i];
				temp_array[i] = temp;
			}
			
		}
		
		temp_array[r-1] = temp_array[i+1];
		temp_array[i+1] = x;
		
		return i+1;
	}
	

}
