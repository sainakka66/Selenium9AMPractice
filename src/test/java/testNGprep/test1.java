package testNGprep;

import org.testng.annotations.Test;

public class test1 
{
	
	@Test(priority=1)
	void login()
	{
		System.out.println("Login Method");
	}
	
	@Test(priority=2)
	void search()
	{
		System.out.println("Search Method");
	}
	
	@Test(priority=3)
	void Advsearch()
	{
		System.out.println("Advsearch Method");
	}
	
	@Test(priority=4)
	void logout()
	{
		System.out.println("Logout Method");
	}
	
	
}
