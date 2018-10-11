package com.facebookaccountcreation;

public class staticVariables 
{  //variables declared inside the class and outside the method with static modifier keyword
	static int a = 1000;
	static int b = 2000;

	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		m1(); //static method directly accessing
		staticVariables sv = new staticVariables();
		sv.m2(); // non-static method using object
		System.out.println(staticVariables.a); //static variables are called using class name
		System.out.println(staticVariables.b); //syntax classname.variablename
		//any type of area i.e, static or non-static we can access using classname
	}
		static void m1()
	{
		System.out.println(a);
		System.out.println(b);
	}

	void m2()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
