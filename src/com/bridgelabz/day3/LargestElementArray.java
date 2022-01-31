package com.bridgelabz.day3;

public class LargestElementArray {

	public static void main(String[] args) {
		
		int arr[]=new int[] {1,2,4,32,34};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("maximum element is "+max);
	}
}
