package com.bridgelabz.day3;

public class PrintOddPositionOfElementArray {

	public static void main(String[] args) {
		
		int a[]=new int[] {1,2,3,5,6,7,8};
		
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
	}
}
