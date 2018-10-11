package com.facebookaccountcreation;

public class ReturnTypeMethod {
	int m1()
	{
		System.out.println("m1 method");
		return 10;
	}
	float m2()
	{
		System.out.println("m2 method");
		return 10.5f;
	}
	String m3()
	{
		System.out.println("m3 method");
		return "a";
	}
	public static void main(String[] args) 
	{
		
		ReturnTypeMethod m = new ReturnTypeMethod();
		int a = m.m1();
		System.out.println(a);
		float f = m.m2();
		System.out.println(f);
		String s = m.m3();
		System.out.println(s);

	}

}
