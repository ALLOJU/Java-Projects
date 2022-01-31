package com.bridgelabz.day2;

import java.util.Scanner;

public class SumOfNaturalNumbersUsingWhile {

	public static void main(String args[]) {

		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		num=sc.nextInt();
		int i=1;
		while(i<=num)
		{
			sum=sum+i;
			
			i++;
		}
		System.out.println("Sum of Natural Numbers is "+sum);
	} 
}
