package Prepa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement furniture = driver.findElement(By.xpath("//img[@alt='Home & Furniture']"));
		Actions action = new Actions(driver);
		action.moveToElement(furniture).build().perform();
		
		Thread.sleep(2000);
		WebElement fur1 = driver.findElement(By.xpath("//a[text()='Kitchen & Dining']"));
		action.moveToElement(fur1).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Cookware']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		
	}

}
