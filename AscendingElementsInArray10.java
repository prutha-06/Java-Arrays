//WAP to sort the elements of an array in ascending order.
package com.kn.ArrayPrograms;

import java.util.Arrays;

public class AscendingElementsInArray10 {

	public static void main(String[] args) {
		int arr[] = { 87, 65, 34, 66, 11 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascending order of elements= ");
		// Ascending order
			System.out.println(Arrays.toString(arr));
	}

}
