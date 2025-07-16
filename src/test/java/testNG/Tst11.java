package testNG;

import org.testng.annotations.Test;

public class Tst11
{
	@Test
	void login()
	{
		System.out.println("Login Layer");
	}
	
	@Test
	void search()
	{
		System.out.println("search Layer");
	}
	
	@Test
	void advsearch()
	{
		System.out.println("Advsearch Layer");
	}
	
	@Test
	void logout()
	{
		System.out.println("Logout Layer");
	}
	
}
