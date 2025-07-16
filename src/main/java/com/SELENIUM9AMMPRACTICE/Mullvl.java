package com.SELENIUM9AMMPRACTICE;

class A
{
	void m1()
	{
		System.out.println("A method");
	}
}

class B extends A
{
	void m2()
	{
		System.out.println("B method");
	}
}

public class Mullvl extends B {
	
	int m3()
	{
		System.out.println("C method");
		return 1000;
	}

	public static void main(String[] args) {
		A nn = new A();
		nn.m1();
		
		B nnn = new B();
		nnn.m1();
		nnn.m2();
		
		Mullvl n = new Mullvl();
		n.m1();
		n.m2();
		n.m3();
		

	}

}
