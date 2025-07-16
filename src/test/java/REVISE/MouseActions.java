package REVISE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MouseActions {

	public static void main(String[] args) 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(electronics).build().perform();
		
		WebElement computerPherp = driver.findElement(By.xpath("//a[text()='Computer Peripherals']"));
		action.moveToElement(computerPherp).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Printers']")).click();
		
		WebElement txt = driver.findElement(By.xpath("//div[text()='4★ & above']"));
		System.out.println(txt.getText());
		
		
		
		
	}

}
