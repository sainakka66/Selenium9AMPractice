package Newww;

import org.testng.annotations.Test;

public class GroupingSmoke 
{
	@Test(priority=1,groups= {"smoke"})
	void Loginbygmail()
	{
		System.out.println("Login by Gmail");
	}
	
	@Test(priority=2,groups= {"smoke"})
	void Loginbyfacebook()
	{
		System.out.println("Login by Facebook");
	}
	
	@Test(priority=3,groups= {"smoke"})
	void LoginbySkype()
	{
		System.out.println("Login by Skype");
	}
	
}
