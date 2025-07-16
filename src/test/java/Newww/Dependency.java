package Newww;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency 
{
	@Test
	void openapp()
	{
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"openapp"})
	void login()
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
	void logout()
	{
		Assert.assertTrue(true);
	}
		
}
