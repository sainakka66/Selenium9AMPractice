package Prepa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);

		WebElement  Fbselect = driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);

		Select select = new Select(Fbselect);
		Thread.sleep(2000);
		select.selectByVisibleText("22");
		
	}

}
