package com.bridgelabz.day3;

import java.util.Scanner;

public class PrintElementsArray {

	public static void main(String[] args) {
		
		/*
		 * int arr[]= {1,2,3,4,5};
		 * 
		 * for(int i=0;i<arr.length;i++) {
		 * System.out.println("Array Elements are"+arr[i]);
		 * 
		 * }
		 */
		System.out.println("Enter number of elements of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[10];
		System.out.println("enter elements of array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("elements of array are");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		}
}
