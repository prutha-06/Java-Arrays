//Write a Java program to find the index of an array element.
package com.kn.ArrayPrograms;

public class FindIndexOfElement04 {

	public static void main(String[] args) {
		int arr[] = { 1789, 2035, 1899, 1456, 2013 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2035) {
				System.out.print("The Index of an element is= " + i);

			}

		}

	}

}
