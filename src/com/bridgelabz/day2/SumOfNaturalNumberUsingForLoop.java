package com.bridgelabz.day2;

import java.util.Scanner;

public class SumOfNaturalNumberUsingForLoop {

	public static void main(String args[])
	{
		int num,sum=0;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of a Natural Numbers  is "+sum);
	}
	
}
