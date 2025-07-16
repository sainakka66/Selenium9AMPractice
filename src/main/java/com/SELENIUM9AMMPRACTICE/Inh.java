package com.SELENIUM9AMMPRACTICE;

class Parent
{
	void m1()
	{
		System.out.println("m1 method");
	}
}

public class Inh extends Parent{

	void m2()
	{
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		Inh n = new Inh();
		n.m1();
		n.m2();
	}

}
