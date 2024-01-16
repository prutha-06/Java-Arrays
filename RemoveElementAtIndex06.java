//Write a Java program to remove a specific element from an array.
package com.kn.ArrayPrograms;

import java.util.Arrays;

public class RemoveElementAtIndex06 {

	public static void main(String[] args) {
		int arr[]= {12,23,45,54,88,67};
		System.out.println("Array before removing the element from given index");
		System.out.println(Arrays.toString(arr));
		int inedxToRemove=2;
		for(int i=inedxToRemove; i<arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		System.out.println("Array after removing the element from given index");

		System.out.println(Arrays.toString(arr));


	}

}
