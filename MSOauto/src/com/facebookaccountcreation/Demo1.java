package com.facebookaccountcreation;
public class Demo1 
{ int a = 10;
  int b = 20;
  static int c = 30;
  static int d = 40; 
  void m1()
  {
   System.out.println(a);
   System.out.println(b);
   Demo1 d = new Demo1();
   System.out.println(d.c);
   System.out.println(d.d);
  }
  static void m2()
  {
  Demo1 d1 = new Demo1();
  System.out.println(d1.a);
  System.out.println(d1.b);
  System.out.println(c);
  System.out.println(d);
  }
	public static void main(String[] args) 
	{
	Demo1 D = new Demo1();
	D.m1();
	m2();
	}

}
