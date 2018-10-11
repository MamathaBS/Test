package com.facebookaccountcreation;
class parentClass 
{
        int a = 10;
        int b = 20;
  void m1()
{	int a = 1000;
    int b = 2000;
}
  }
class childClass
{
	
int a = 100;
int b = 200;
	public static void main(String[] args) 
	{  
		parentClass pc = new parentClass();
		pc.m1();
		System.out.println(pc.a);
		System.out.println(pc.b);
		childClass cc = new childClass();
		System.out.println(cc.a);
		System.out.println(cc.b);
	}

}
