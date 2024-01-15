//Write a Java program to print all elements of a given array(Reverse).
package com.kn.ArrayPrograms;

public class ArrayQuestion02 {

	public static void main(String[] args) {
		int arr[]= {12,23,45,67};
		System.out.print("[ ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
		
	}

}
