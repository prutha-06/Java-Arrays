//Write a Java program to copy an array by iterating the array.
package com.kn.ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CopyGivenArray09 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array= ");
		int len=sc.nextInt();
		int a1[]=new int[len];
		System.out.println("Insert the values for an array= ");
		for(int i=0; i<a1.length; i++) {
			a1[i]=sc.nextInt();		
		}
		//traversing
		System.out.print("[");
		for(int i=0; i<a1.length;i++) {
			if(i==0) {
			System.out.print(a1[i]);
			}else {
				System.out.print(", "+a1[i]);
			}
		}
		System.out.println("]");
		
		int a2[] = new int[a1.length];
		for (int i = 0; i < a1.length; i++) {
			a2[i] = a1[i];
		}
		System.out.println("Copied Array");
		System.out.println(Arrays.toString(a2));

	}

}
