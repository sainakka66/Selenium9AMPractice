package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checknduncheck {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		
		List<WebElement> Cbs = driver.findElements(By.xpath("//input[@name='cars' and @type='checkbox']"));
		
		
		System.out.println(Cbs.size());
		
		for(WebElement cb:Cbs)
		{
			if(cb.isSelected())
			{
				cb.click();
			}
			else
			{
				cb.click();
			}
		}
		
		//UNSELECT ALL CHECKBOXES;
		
		for(WebElement cb:Cbs)
		{
			if(cb.isSelected())
			{
				cb.click();
			}
			else
			{
				cb.click();
			}
		}
		
	}

}
