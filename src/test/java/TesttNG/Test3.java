package TesttNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3
{
	@Test
	void m1()
	{
		System.out.println("Class1-m1 method");
	}
	
	@BeforeTest
	void m3()
	{
		System.out.println("BeforeTest-m3 method");
	}
	
}
