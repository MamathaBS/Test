package com.facebookaccountcreation;

public class AddFirstAndLastDigits {

	public static void main(String[] args) 
	{
	  int number = 55245451;
	  int First_Digit;
	  int Last_Digit;
	  First_Digit = number;
	  while(First_Digit >= 10)
	  {
		  First_Digit =First_Digit/10;
	  }
	  
	  Last_Digit = number % 10;
	  System.out.println(First_Digit);
	  System.out.println(Last_Digit);
	  System.out.println(First_Digit+Last_Digit);
	}

}
