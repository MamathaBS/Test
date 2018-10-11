package com.facebookaccountcreation;

public class Methods {
	
	void m111(int a , char c)
	{
		System.out.println("m111 method");
		System.out.println(a);
		System.out.println(c);
	}
	static void m112(String str, double d)
	{
		System.out.println("m112 method");
		System.out.println(str);
		System.out.println(d);
	}

	public static void main(String[] args)
	{
	  Methods m = new Methods();
	  m.m111(10, 'c');
	  Methods.m112("mammu", 10.5);
		
	}

}
