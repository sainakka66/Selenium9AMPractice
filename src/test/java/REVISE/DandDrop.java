package REVISE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DandDrop {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		WebElement frameenter = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frameenter);
		
		WebElement first = driver.findElement(By.id("field1"));
		WebElement second = driver.findElement(By.id("field2"));
		WebElement cpybtn = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		first.clear();
		first.sendKeys("SAI NAKKA");
		
		Actions action = new Actions(driver);
		action.doubleClick(cpybtn).build().perform();
		
		
	}

}
