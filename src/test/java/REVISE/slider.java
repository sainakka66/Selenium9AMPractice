package REVISE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		
		
		WebElement framecolor = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(framecolor);
		
		Actions action = new Actions(driver);
		
		WebElement green = driver.findElement(By.xpath("//div[@class='ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min' and @style='width: 100%;']"));
		System.out.println(green.getLocation());  //
		
		action.dragAndDropBy(green, 50, 50).build().perform();
		System.out.println(green.getLocation());
		
	}

}
