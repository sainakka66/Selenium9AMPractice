package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DandD {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source = driver.findElement(By.xpath("//div[text()='Washington'][2]"));
		WebElement target = driver.findElement(By.xpath("//div[text()='United States']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
	}

}
