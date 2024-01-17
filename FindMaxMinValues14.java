//Write a Java program to find the maximum and minimum value of an array.
package com.kn.ArrayPrograms;

public class FindMaxMinValues14 {

	public static void main(String[] args) {
		int arr[] = { 92, 23, 43, 21 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Minimum value= " + min);
		System.out.println("Maximum value= "+ max);

	}

}
