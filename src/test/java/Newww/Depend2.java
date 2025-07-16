 package Newww;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depend2 
{
	@Test
	void openapp()
	{
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = {"openapp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = {"login"})
	void search()
	{
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"login","search"})
	void Advsearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
}
