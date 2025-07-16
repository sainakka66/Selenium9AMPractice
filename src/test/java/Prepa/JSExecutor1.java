package Prepa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		
		 WebElement input = driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('value','Laptop')", input);
		 
		 WebElement search = driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
		 JavascriptExecutor js1 = (JavascriptExecutor)driver;
		 js1.executeScript("arguments[0].click()", search);
		
	}

}
