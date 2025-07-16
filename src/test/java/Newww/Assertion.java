package Newww;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion 
{
	@Test
	void testtitle()
	{
		String ext = "SAI NAKKA";
		String act = "SAI Nakka";
		
		if(ext.equals(act))
		{
			System.out.println("test pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test fail");
			Assert.assertTrue(false);
		}
		
//		Assert.assertEquals(ext, act);
		
	}
	
}
