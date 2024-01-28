//24]find all pairs of elements in an array whose sum is equal to a specified number.
package com.kn.ArrayPrograms;

public class SumOfElements24 {

	public static void main(String[] args) {
		int a[] = { 2, 7, 4, -5, 11, 5, 20 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 15) {
					System.out.println("Pairs= " + a[i] + " " + a[j]);
				}
			}
		}
	}

}
