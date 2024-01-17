//Write a Java program to find missing element in an ar×ay.
package com.kn.ArrayPrograms;

public class FindMissingElement18 {

	public static void main(String[] args) {
		int totalnumbers=7;
		int a[]= {1,2,3,4,6,7};
		int totalSum=totalnumbers*((totalnumbers+1)/2);
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		int missingNumber=totalSum-sum;
		System.out.println("Missing number is= "+missingNumber);

	}

}
