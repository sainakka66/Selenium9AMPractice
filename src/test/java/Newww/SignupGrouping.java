package Newww;

import org.testng.annotations.Test;

public class SignupGrouping 
{
	@Test(priority=1,groups= {"Regression"})
	void Signupbygmail()
	{
		System.out.println("Signup by Gmail");
	}
	
	@Test(priority=2,groups= {"Regression"})
	void Signupbyfacebook()
	{
		System.out.println("Signup by Facebook");
	}
	
	@Test(priority=3,groups= {"Regression"})
	void SignupbySkype()
	{
		System.out.println("Signup by Skype");
	}
}
