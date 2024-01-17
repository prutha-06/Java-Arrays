//Write a Java program to calculate the average value of array elements.
package com.kn.ArrayPrograms;

public class AverageOfArrayElements13 {

	public static void main(String[] args) {
		int array[]= {3,4,5,7,9};
		double sum=0.0;int count=0;
		double avg=0.0;
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
			count++;
			sum=sum+array[i];
		}
		System.out.println();
		System.out.println("Count of Array elements= "+count);
		System.out.println("Sum of Array Elements= "+sum);
		avg=(sum/count);
		System.out.println("Average of Array Elements= "+avg);

	}

}
