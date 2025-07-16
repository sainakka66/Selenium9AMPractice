package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	/*	1)SCROLL DOWN THE PAGE (BASED ON PIXEL NUMBERS);
	 * JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1200);
		js.executeScript("window.scrollBy(0,1500)", " ");
		
		System.out.println(js.executeScript("return window.pageYOffset;")); */
		
		// 2)SCROLL DOWN THE PAGE, TILL WE CAN/GET IDENTIFY CERTAIN VERY LAST ELEMENT IN THAT WEBPAGE.
		WebElement  news = driver.findElement(By.xpath("//strong[text()='News']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1200);
		js.executeScript("arguments[0].scrollIntoView()", news);
		
		// ( return window.pageYOffset; ): it is used to count the pixels.
		System.out.println(js.executeScript("return window.pageYOffset;")); 
		
		
		
	}

}
