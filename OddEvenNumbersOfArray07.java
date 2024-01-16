//Write a Java program to find the number of even and odd integers in specified array.
package com.kn.ArrayPrograms;

public class OddEvenNumbersOfArray07 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4,9,5,2 };
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;

			}
		}
		System.out.println("Number of even numbers= "+count);
		System.out.println("Number of odd numbers= "+(arr.length-count));
	}

}

