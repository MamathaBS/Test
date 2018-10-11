package com.facebookaccountcreation;

public class instanceVariables //scope of instance variable inside the class all methods and constructors and blocks
{
	int a = 100; //variables declared inside the class instance variables
	int b = 200;

	public static void main(String[] args) //main method
	{
		instanceVariables iv = new instanceVariables();
		
		System.out.println(iv.a);
		System.out.println(iv.b);
		iv.m1();
	}
	void m1()
	{
		System.out.println(a+b);
	}
}
