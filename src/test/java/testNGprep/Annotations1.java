package testNGprep;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 
{
	@BeforeClass
	void open()
	{
		System.out.println("BeforeClass -Open Method");
	}
	
	
	@BeforeMethod
	void login()
	{
		System.out.println("BeforeMethod -Login Method");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Search Method");
	}
	
	@Test(priority=2)
	void Advsearch()
	{
		System.out.println("Advsearch Method");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("AfterMethod -Logout Method");
	}
	
	
	@AfterClass
	void close()
	{
		System.out.println("AfterClass -Close Method");
	}
	
	
}
