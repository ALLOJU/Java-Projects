package com.bridgelabz.day2;

import java.util.Scanner;

public class AirthmaticOperations {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		int r1,r2,r3,r4;
		
		int min,max;
		
		System.out.println("enter a,b,c values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		r1= a+b*c;
		
		r2=c+a/b;
		
		r3=a%b+c;
		
		r4=a*b+c;
		
		System.out.println("Result " +r1);
		
		System.out.println("Result "+r2);
		
		System.out.println("Result "+r3);
		
		System.out.println("Result "+r4);
		if(r1>r2)
		{
			max=r1;
			min=r2;
			if(r1>r3)
			{
				max=r1;
				min=r3;
			}
			else {
				max=r3;
				min=r1;
				 }
			if(r1>r4)
			{
				max=r1;
				min=r4;
			}
			else {
				max=r4;
				min=r1;
				 }
		}
		else {
			max=r2;
			min=r1;
			
		}
		
		System.out.println("maximum value is"+max);
		System.out.println("minimum value is"+min);
	}

}
