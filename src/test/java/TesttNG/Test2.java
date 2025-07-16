package TesttNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2
{
	
	@BeforeClass
	void open()
	{
		System.out.println(" BeforeClass - Open method");
	}
	
	@BeforeMethod
	void Login()
	{
		System.out.println("BeforeMethod - Login method");
	}
	
	@Test(priority=1)
	void Search()
	{
		System.out.println("Search method");
	}
	
	@Test(priority=2)
	void AdvSearch()
	{
		System.out.println("AdvSearch method");
	}
	
	@AfterMethod
	void Logout()
	{
		System.out.println("AfterMethod - Logout method");
	}
	
	@AfterClass
	void close()
	{
		System.out.println(" AfterClass - Close method");
	}
}
