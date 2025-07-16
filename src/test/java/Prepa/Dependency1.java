package Prepa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency1 
{
	
	@Test
	void openApp()
	{
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"openApp"})
	void Login()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	void search()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	void Advsearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	void Logout()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test
	void closeApp()
	{
		Assert.assertTrue(true);
	}
}
