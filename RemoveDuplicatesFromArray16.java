//Write a Java program to remove duplicate elements from an array.
package com.kn.ArrayPrograms;

public class RemoveDuplicatesFromArray16 {

	public static void main(String[] args) {
		int a[] = { 20, 20, 30, 40, 50, 50, 50 };
		int len = a.length;
		len = remDup(a, len);
		System.out.println("After removing the duplicates from array= ");
		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static int remDup(int a[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int newA[] = new int[n];// n=6
		int j = 0;
		for (int i = 0; i < n - 1; i++) {// 20,20,30,40,50,50,50
			if (a[i] != a[i + 1]) {
				newA[j++] = a[i];
			}
		}
		newA[j++] = a[n - 1];
		for (int i = 0; i < n; i++) {
			a[i] = newA[i];
		}
		return j;

	}

}
