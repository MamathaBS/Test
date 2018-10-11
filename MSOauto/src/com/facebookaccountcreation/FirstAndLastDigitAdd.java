package com.facebookaccountcreation;

import java.util.Scanner;

public class FirstAndLastDigitAdd {

	public static void main(String[] args) 
	{
		int number = 481425, First_Digit , Last_Digit;	
		Scanner sc = new Scanner(System.in);
		First_Digit = number;
		System.out.println("Enter a number");
		number = sc.nextInt();
	
		while(First_Digit >= 10)
		{
			First_Digit = First_Digit / 10;
		}
		
		Last_Digit = number % 10;
		System.out.println("First digit :" + First_Digit);
		System.out.println("Last digit : " + Last_Digit);
		System.out.println(First_Digit+Last_Digit);
	}

}
