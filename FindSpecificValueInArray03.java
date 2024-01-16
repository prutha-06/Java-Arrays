//Write a Java program to test if an array contains a specific value. 
package com.kn.ArrayPrograms;

public class FindSpecificValueInArray03 {

	public static void main(String[] args) {
		int arr[] = { 1789, 2035, 1899, 1456, 2013 };
		int key = 2013;
		int idx = Search(arr, key);
		if (idx >= 0) {
			System.out.println("Key found at index" + idx);
		} else {
			System.out.println("Key not found");
		}
	}
	static int Search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
