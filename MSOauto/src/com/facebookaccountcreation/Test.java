package com.facebookaccountcreation;

public class Test 
{
     static int i = 1000;
     static int j = 2000;
     
	public static void main(String[] args) 
	{
		Test t = new Test();
		System.out.println(Test.i);
		System.out.println(Test.j);
  	t.m1();

	}

	static void m1()
	{
		
		System.out.println(i);
	}

	public char[] a;
}
