//23]find the smallest and second smallest elements of a given array.
package com.kn.ArrayPrograms;

public class SmallestAndSecondSmallest23 {

	public static void main(String[] args) {
		int a[]= {21,11,65,45,88,53,1};
		int temp;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Sorted numbers= ");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("smallest= "+a[a.length-1]);
		System.out.println("second smallest= "+a[a.length-2]);
	}

}
