package com.bridgelabz.day2;

import java.util.Scanner;

public class DisplayUnits {

	public static void main(String args[]) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		n = sc.nextInt();
		int one=1,tens=1,hundred=1,thousand=1;
		 one=(n/1)%10;
		tens= (n/10)%10;
		hundred = (n/100)%10;

		if(one==1) {
			System.out.println("One");
		}
		else if(tens==1) {
			System.out.println("tens");
		}
		else if(hundred==1) {
			System.out.println("hundred");
		}
		else if(thousand==1) {
			System.out.println("thousand");
		}
		else {
			System.out.println("invalid");
		}
			







	}
}
