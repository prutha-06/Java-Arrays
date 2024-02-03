//26.Write a Java program to test the equality of two arrays
package com.kn.ArrayPrograms;

public class TestEqualityOfArrays26 {

	public static void main(String[] args) {
		int arr1[] = { 2, 5, 7, 8, 11 };
		int arr2[] = { 2, 5, 7, 8, 11 };
		boolean equal = true;
		int n = arr1.length;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < n; i++) {
				if (arr1[i] != arr2[i]) {
					equal = false;
				}
			}
		}
		if (equal) {
			System.out.println("Two arrays are equal");
		} else {
			System.out.println("Two arrays are not equal");
		}
	}

}
