//21]find the second smallest element in an array.

package com.kn.ArrayPrograms;

public class SecondSmallestNumber21 {

	public static void main(String[] args) {
		int arr[]= {44,12,65,98,34,22,99};
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The Second smallest element= "+arr[1]);

	}

}
