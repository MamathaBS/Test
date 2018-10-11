package com.facebookaccountcreation;

public class Demo 
{
    int a = 5;
    int b = 10;
    
    static void m11()
    {
    	Demo d = new Demo();
    	System.out.println(d.a);
    	System.out.println(d.b);     
    }
    static void m21()
    {
    	Demo d = new Demo();
    	System.out.println(d.a);
    	System.out.println(d.b);
    }
	public static void main(String[] args) 
	{
	m11();
	m21();
	}

}
