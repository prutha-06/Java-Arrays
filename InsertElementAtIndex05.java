//Write a Java program to insert an element (specific position) into an array.
package com.kn.ArrayPrograms;

import java.util.Arrays;

public class InsertElementAtIndex05 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int n = arr.length;
		int val = 60;
		//declaring new array
		int newArr[] = new int[n + 1];
		System.out.println("Array before inserting an element");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < n; i++) {
			newArr[i] = arr[i];

		}
		newArr[n] = val;// n=arr.length==5
		System.out.println("Array after inserting an element");
		System.out.println(Arrays.toString(newArr));

	}

}
