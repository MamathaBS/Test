package com.facebookaccountcreation;

public class Test1 
{
      int a=10;
      static int b=20;
      
	public static void main(String[] args) 
	{
		Test1 t = new Test1();
		System.out.println(t.a);
		System.out.println(t.b);
		
           t.a = 777;
           t.b =999;
           System.out.println(t.a);
   		System.out.println(t.b);
	}

}
