package com.facebookaccountcreation;

public class DefaultValues 
{
static int a; // for instance variables and static variables jvm will assign default values if it is not declared 
boolean b;
String c;
char d;
double e;
float f;
short g;
byte h;
long i;

	public static void main(String[] args) 
	{
		//int a; default values are not assigned for local variables
		//int b;
		//System.out.println(a);
		//System.out.println(b);
		DefaultValues DV=new DefaultValues();
		System.out.println(DV.a);
		System.out.println(DV.b);
		System.out.println(DV.c);
		System.out.println(DV.d);
		System.out.println(DV.e);
		System.out.println(DV.f);
		System.out.println(DV.g);
		System.out.println(DV.h);
		System.out.println(DV.i);
	}
}
