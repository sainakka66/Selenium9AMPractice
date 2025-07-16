package Prepa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		
		
		WebElement cart = driver.findElement(By.xpath("//a[@class='_1krdK5 _3jeYYh' and text()='Cart']"));
		Actions action = new Actions(driver);
		action.moveToElement(cart).build().perform();
		
		 String text = cart.getText();
		 System.out.println("The text is: " + text);
		
		
		
		
		
		
		
		
		
	}

}
