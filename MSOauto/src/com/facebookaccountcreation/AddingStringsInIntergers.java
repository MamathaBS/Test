package com.facebookaccountcreation;

public class AddingStringsInIntergers 
{
    String a = "100";
    String b = "1000";
   
	public static String main(String[] args) 
	{
		AddingStringsInIntergers a = new AddingStringsInIntergers();
		System.out.println(a.a);
		System.out.println(a.b);
		return Integer.toString(Integer.parseInt("100") + Integer.parseInt("1000"));
	}

}
