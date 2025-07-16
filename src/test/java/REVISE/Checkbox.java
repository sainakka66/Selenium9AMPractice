package REVISE;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		URL myurl = new URL("https://www.letskodeit.com/practice");
		driver.navigate().to(myurl);
		driver.manage().window().maximize();
		
		WebElement CB = driver.findElement(By.xpath("//input[@id='bmwcheck']"));
		System.out.println("The Check Box Status: "+CB.isSelected());
		Thread.sleep(1800);
		CB.click();
		
	}

}
