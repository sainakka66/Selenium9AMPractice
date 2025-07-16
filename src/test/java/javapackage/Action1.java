package javapackage;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1500);
		
		WebElement  ele = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		Thread.sleep(1500);
		
		WebElement cp = driver.findElement(By.xpath("//a[text()='Computer Peripherals']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(cp).build().perform();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//a[text()='Monitors']")).click();
		
		  String gt = driver.findElement(By.xpath("//div[text()='4★ & above']")).getText();
		  System.out.println(gt);
		
	}

}
