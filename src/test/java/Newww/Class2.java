package Newww;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 
{
	
	@Test
	void m2()
	{
		System.out.println("cls-m2 method");
	}
	
	@AfterTest
	void m4()
	{
		System.out.println("AfterTest-m4 method");
	}
	
}
