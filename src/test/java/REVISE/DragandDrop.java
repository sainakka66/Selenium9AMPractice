package REVISE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement target = driver.findElement(By.xpath("//div[text()='United States']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
	}

}
