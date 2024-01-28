package com.kn.ArrayPrograms;

public class DiffBetweenLargestAndSmallest22 {

	public static void main(String[] args) {
		int arr[]= {34,11,7,45,99,12};
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
		int smallest=arr[0];
		int largest=arr[arr.length-1];
		int difference=largest-smallest;
		System.out.println("Difference between largest and smallest number= "+difference);

	}

}
