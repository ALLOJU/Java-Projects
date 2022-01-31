package com.bridgelabz.day2;

import java.util.Scanner;

public class ReverseOfNumberUsingWhile {

	public static void main(String args[]) {
		
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	num=sc.nextInt();
	int rev = 0,rem;
	while(num>0)
	{
		rem=num%10;
		num=num/10;
		rev=(rev*10)+rem;
		
	}
		
	System.out.println("Reverse Of Given Number"+rev);
	}
}
