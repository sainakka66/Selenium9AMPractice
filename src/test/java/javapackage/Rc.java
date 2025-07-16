package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rc {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/3.x/demo.html");
		driver.manage().window().maximize();
		
		WebElement Rcbtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions(driver);
		Thread.sleep(2500);
		action.contextClick(Rcbtn).build().perform();
		
	}

}
