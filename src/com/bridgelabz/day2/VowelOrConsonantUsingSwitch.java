package com.bridgelabz.day2;

import java.util.Scanner;

public class VowelOrConsonantUsingSwitch {

	public static void main(String args[]) {
		
		System.out.println("Enter a Character");
		Scanner sc=new Scanner(System.in);
		char cha=sc.nextLine().charAt(0);
		char ch=Character.toUpperCase(cha);
		
		switch(ch) {
		
		case 'A':
		
		case 'E':
			
		case 'I':
		
		case 'O':
		
		case 'U':
			System.out.println(ch+" is A Vowel");
			break;
		default:
			System.out.println(ch+" is Not A Vowel");
		
		
		}
	}
}
