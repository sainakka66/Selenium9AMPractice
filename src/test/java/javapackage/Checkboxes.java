package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement Bmw = driver.findElement(By.id("bmwcheck"));
		System.out.println(Bmw.isSelected());
		
		Bmw.click();
		
	}

}
