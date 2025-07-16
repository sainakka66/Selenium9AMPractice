package Prepa;

import java.time.Duration;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NewwindowORtab {

	public static void main(String[] args) 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://demo.nopcommerce.com/");
		driver.close();
		
		
		//page no: 95 pending
	}

}
