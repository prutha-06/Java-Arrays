//Write a Java program to print all elements of a given array(As it is).
package com.kn.ArrayPrograms;

public class ArrayQuestion01 {

	public static void main(String[] args) {
		int arr[] = { 1789, 2035, 1899, 1456, 2013 };
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

}
