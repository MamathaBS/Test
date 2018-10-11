package com.facebookaccountcreation;

public class Test2 {

	int i = 10;
	int j = 20;
	
	static void m1()
	{
		Test2 t = new Test2();
		System.out.println(t.i);
		System.out.println(t.j);
	}
	static void m2()
	{
		Test2 t = new Test2();
		System.out.println(t.i);
		System.out.println(t.j);
	}
	public static void main(String[] args)
	{
		
		Test2.m1();
		Test2.m2();
		
	}

}
