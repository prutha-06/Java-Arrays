//Number of positive,negative,odd, even & Number of 0s.

package com.kn.ArrayPrograms;

public class PrintPosNegOddEvenNumbers08 {

	public static void main(String[] args) {
		int arr[] = { 5, -1, 7, 2, 4, 9, -6, 0 };
		int posCount = 0;
		int negCount = 0;
		int eveCount = 0;
		int oddCount = 0;
		int zerCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				posCount++;
			} else if (arr[i] < 0) {
				negCount++;
			} else if (arr[i] == 0) {
				zerCount++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				eveCount++;
			} else if (arr[i] % 2 != 0) {
				oddCount++;
			}

		}
		System.out.println("Count pos= " + posCount);
		System.out.println("Count neg= " + negCount);
		System.out.println("Count zero= " + zerCount);
		System.out.println("Count even= " + eveCount);
		System.out.println("Count odd= " + oddCount);

	}

}
