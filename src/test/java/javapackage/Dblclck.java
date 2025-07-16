package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dblclck {

	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
		
		  WebElement f1 = driver.findElement(By.xpath("//input[@id='field1']"));
		  WebElement f2 = driver.findElement(By.xpath("//input[@id='field2']"));
		  WebElement btn = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		  
		  f1.clear();
		  f1.sendKeys("SAI NAKKA");
		  
		  Actions action = new Actions(driver);
		  action.doubleClick(btn).build().perform();
		  
		
	}

}
