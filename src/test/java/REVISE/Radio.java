package REVISE;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws MalformedURLException 
	{
		
		WebDriver driver = new ChromeDriver();
		URL myurl = new URL("https://www.letskodeit.com/practice");
		driver.navigate().to(myurl);
		driver.manage().window().maximize();
		
		WebElement bmwradio = driver.findElement(By.id("bmwradio"));
		WebElement benzradio = driver.findElement(By.id("benzradio"));
		WebElement hondaradio = driver.findElement(By.id("hondaradio"));
		
		System.out.println("Before Selecting Radio Button");
		System.out.println(bmwradio.isSelected());
		System.out.println(benzradio.isSelected());
		System.out.println(hondaradio.isSelected());
		
		System.out.println("After Selecting BMW Radio Button");
		System.out.println(bmwradio.isSelected());
		bmwradio.click();
		System.out.println(benzradio.isSelected());
		System.out.println(hondaradio.isSelected());
		
	}

}
