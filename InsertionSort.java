package main.java;

import java.util.Dictionary;

// 
/**
 *  In Insertion sort, we are comparing right hand side value with the sub sorted list(left hand side)....
 *  we are saving the right hand side value in the temp variable and then comparing the temp value with the sub sort list
 *  values if the sub sort list value is greater than the temp value then we are right shifting the sub list value and then decreasing the sublist counter value
 * @author mohijain
 *
 *
 */
//  
public class InsertionSort<K, V> {
	/*public Dictionary<Integer, String> d ;
	
	public void temp(){
		d.put(1, "fdfd");
		d.put(1, "temp");
		d.size();
		
	}*/
	public static void main(String[] args) {

		int[] array = { 10, 34, 2, 56, 7, 67, 88, 42 };
		for (int j = 1; j < array.length; j++) {

			int i = j - 1;
			int temp = array[j];

			while ((i > -1) && (array[i] > temp)) {

				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = temp;
		}

		for (int i1 : array) {
			System.out.print(i1);
			System.out.print(" ");
		}
	}

}
