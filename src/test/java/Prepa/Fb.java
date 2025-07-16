package Prepa;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fb 
{
	
	WebDriver driver;
	
	@BeforeClass
	void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void launchApplication(String email, String password) throws MalformedURLException
	{
		URL myurl = new URL("https://www.facebook.com/");
		driver.navigate().to(myurl);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#email")).sendKeys(email);
		
		driver.findElement(By.cssSelector("div#passContainer")).sendKeys(password);
		
		driver.findElement(By.cssSelector("button#u_0_5_Md")).click();
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
