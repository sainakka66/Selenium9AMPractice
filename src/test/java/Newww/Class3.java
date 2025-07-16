package Newww;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Class3 
{
	@BeforeSuite
	void m6()
	{
		System.out.println("BeforeSuite-m6 method");
	}
	
	void m5()
	{
		System.out.println("m5 method");
	}
	
	@AfterSuite
	void m7()
	{
		System.out.println("AfterSuite-m7 method");
	}
	
}
