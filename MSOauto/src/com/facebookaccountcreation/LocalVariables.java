package com.facebookaccountcreation;

public class LocalVariables {

	void m1()
	{
		int i = 100; //inside method local variables
		System.out.println(i);  // scope of local variable is inside the method only
	}
	public static void main(String[] args) 
	{            // inside method local variables or constructor or blocks
	    int a = 10;  //local variables are stored in stack memory
	    int b = 20;
	    System.out.println(a+b);
	    LocalVariables LV = new LocalVariables();
	    LV.m1();
	}

}
