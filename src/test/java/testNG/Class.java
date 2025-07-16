package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class 
{
	
	@BeforeClass
	void login()
	{
		System.out.println("Login Layer");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("***Search Layer***");
	}
	
	@Test(priority=2)
	void advsearch()
	{
		System.out.println("***Advsearch Layer***");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("Logout Layer");
	}
	
}
