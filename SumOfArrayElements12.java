//Write a Java program to sum values of an array.
package com.kn.ArrayPrograms;

public class SumOfArrayElements12 {

	public static void main(String[] args) {
		int arr[]= {3,7,8,2,4};
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of array elements= "+sum);

	}

}
