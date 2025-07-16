package TesttNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 
{
	@BeforeMethod
	void Login()
	{
		System.out.println("Login method");
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
		System.out.println("Logout method");
	}
	
}
