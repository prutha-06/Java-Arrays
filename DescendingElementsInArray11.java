//WAP to sort the elements of an array in descending order.
package com.kn.ArrayPrograms;

import java.util.Arrays;

public class DescendingElementsInArray11 {

	public static void main(String[] args) {
		int arr[] = { 17, 20, 18, 14, 21 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// descending
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length ; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		System.out.println();
		System.out.println("Descending order");

		System.out.println(Arrays.toString(arr));
	}

}
