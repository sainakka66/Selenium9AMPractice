package com.SELENIUM9AMMPRACTICE;

class Parent1
{
	int a = 100;     //Instance 
	int b = 1000;
}

public class Test extends Parent1 {
	
	int a = 200;   //Instance
	int b = 2000;
	
	void add(int a, int b) //Local
	{
		System.out.println(super.a+super.b); //SUPER CLASS
		System.out.println(this.a+this.b); //CURRENT CLASS
		System.out.println(a+b); //LOCAL VARIABLES
	}

	public static void main(String[] args) {
		Test n = new Test();
		n.add(300, 3000);
	}

}
