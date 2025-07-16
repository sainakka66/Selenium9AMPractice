package TesttNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test5 
{
	@BeforeSuite
	void m6()
	{
		System.out.println("BeforeSuite - m6 method");
	}
	
	@Test
	void m5()
	{
		System.out.println("m5 method");
	}
	
	@AfterSuite
	void m7()
	{
		System.out.println("AfterSuite - m7 method");
	}
	
}
