package ParallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Para 
{
	RemoteWebDriver driver;
	
	@Test
	void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test
	void testlogo() throws InterruptedException
	{
		Thread.sleep(2800);
		boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logo, true);
	}
	
	@Test
	void testtitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test
	void testurl() throws InterruptedException
	{
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertEquals(driver.getCurrentUrl(), url);
		Thread.sleep(2500);
	}
	
	@Test
	void close()
	{
		if(driver != null)
		{
			driver.quit();
		}
		else
		{
			System.out.println(" MISTAKE ");
		}
	}
}
