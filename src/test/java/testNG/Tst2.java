package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tst2
{
	@BeforeMethod
	void login()
	{
		System.out.println("Login Layer");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Search Layer");
	}
	
	@Test(priority=2)
	void advsearch()
	{
		System.out.println("Advsearch Layer");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("Logout Layer");
	}
	
}
