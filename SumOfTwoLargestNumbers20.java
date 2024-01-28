//20]Find the sum of two largest elements in an Array.
package com.kn.ArrayPrograms;

public class SumOfTwoLargestNumbers20 {

	public static void main(String[] args) {
		int arr[] = { 12, 32, 54, 11, 99 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int firstMax = arr[arr.length - 1];
		int secMax = arr[arr.length - 2];
		int sum = firstMax + secMax;
		System.out.println("The sum of two largest numbers is= " + sum);
	}

}
