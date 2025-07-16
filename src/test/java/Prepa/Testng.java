package Prepa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng 
{
	
	
	@Test
	void test1()
	{
		System.out.println("Test case -1");
	}
	
	@Test
	void test2()
	{
		System.out.println("Test case -2");
	}
	
	@BeforeMethod
	void BeforeMethod()
	{
		System.out.println("This will execute BeforeMethod");
	}
	
	@AfterMethod
	void AfterMethod()
	{
		System.out.println("This will execute AfterMethod");
	}
	
	@BeforeClass
	void BeforeClass()
	{
		System.out.println("This will execute BeforeClass");
	}
	
	@AfterClass
	void AfterClass()
	{
		System.out.println("This will execute AfterClass");
	}
	
	@BeforeTest
	void BeforeTest()
	{
		System.out.println("This will execute BeforeTest");
	}
	
	@AfterTest
	void AfterTest()
	{
		System.out.println("This will execute AfterTest");
	}
	
	@BeforeSuite
	void BeforeSuite()
	{
		System.out.println("This will execute BeforeSuite");
	}
	
	@AfterSuite
	void AfterSuite()
	{
		System.out.println("This will execute AfterSuite");
	}
	
}
