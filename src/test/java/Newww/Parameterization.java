package Newww;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization 
{
	
	WebDriver driver;
	
	@BeforeClass
	void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void Testlogin(String email, String password) throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2100);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		Thread.sleep(2100);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2100);
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	}
	
	@AfterClass
	void close()
	{
		driver.quit();
	}
	
	
	@DataProvider(name="dp")
	Object[][] logininfo()
	{
		Object data[][] = {
				{"appalaraju143sai@gmail.com", "sainakka6@"},
				{"appalaraju143sai@gmail.com", "saInakka6@"},
				{"appalaraju143sai@gmail.com", "sainakka6"},
				{"appalaraju143sai@gmail.com", "Sainakka6@"},
				
		};
		
		return data;
	}
	
	
}
