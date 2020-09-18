package main.java;

public class SelectionSort {

	public static int[] doSelectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1	; i++) {

			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[j] < arr[index]){
					index = j; //searching for lowest index  
				}
			}
				//swapping concept using a temp variable smallNumber
				int smallerNumber = arr[index];
				arr[index] = arr[i];
				arr[i] = smallerNumber;

			

		}
		return arr;
	}

	public static void main(String a[]) {

		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42, 543, 324 };
		int[] arr2 = doSelectionSort(arr1);
		for (int i : arr2) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
