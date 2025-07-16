package TesttNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test4 
{
	
	@Test
	void m2()
	{
		System.out.println("Class2-m2 method");
	}
	
	@AfterTest
	void m4()
	{
		System.out.println("AfterTest-m4 method");
	}
	
}
