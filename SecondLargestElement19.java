//19]to find the second largest element in an array.
package com.kn.ArrayPrograms;

public class SecondLargestElement19 {

	public static void main(String[] args) {
		int arr[]= {23,12,87,34,90,12};
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second largest number= "+arr[arr.length-2]);
	}
}
