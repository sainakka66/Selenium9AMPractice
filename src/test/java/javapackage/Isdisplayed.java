package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//IsDisplayed():
		//Method1:
		 WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		 System.out.println("The Display Status of Logo: " + logo.isDisplayed());
		 
		 //Method2:
		 boolean logo1 = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		 System.out.println("The Display Status of Logo is: " + logo1);
		 
		 //IsEnabled():
		 //Method1:
		 WebElement log = driver.findElement(By.name("q"));
		 System.out.println( "Testbox is: " + log.isEnabled());
		 
		 //Method2:
		 boolean log1 = driver.findElement(By.name("q")).isEnabled();
		 System.out.println( "Testbox status is : " + log1);
		
	}

}
