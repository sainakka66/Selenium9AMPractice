package Newww;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class 
{
	@Test
	void m1()
	{
		System.out.println("cls-m1 method");
	}
	
	@BeforeTest
	void m3()
	{
		System.out.println("BeforeTest-m3 method");
	}
	
}
