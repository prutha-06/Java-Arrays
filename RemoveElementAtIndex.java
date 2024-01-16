//Write a Java program to remove a specific element from an array.
package com.kn.ArrayPrograms;

public class RemoveElementAtIndex {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		int i, j;
		int size = arr.length;
		int element = 30;
		for (i = 0; i < size; i++) {
			if (element == arr[i]) {
				for (j = i; j < (size - 1); j++)
					arr[j] = arr[j + 1];
				System.out.println("\nRemoved the element successfully!");
				break;
			}
		}
		System.out.println("\nThe new array is: ");
		for (i = 0; i < (size - 1); i++)
			System.out.print(arr[i] + " ");
	}
}
	