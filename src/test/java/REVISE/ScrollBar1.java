package REVISE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollBar1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(2500);
		driver.manage().window().maximize();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Thread.sleep(2500);
//		js.executeScript("window.scrollBy(0,1520)", " ");
//		
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//2.SCROLL DOWN THE PAGE TILL WE CAN IDENTIFY CERTAIN ELEMENT
		
//		WebElement news = driver.findElement(By.xpath("//strong[text()='News']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Thread.sleep(2500);
//		js.executeScript("arguments[0].scrollIntoView()", news);
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		// 3.SCROLL DOWN TILL END OF THE DOCUMENT AND AGAIN TOP:
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(2000);
//		System.out.println(js.executeScript("return window.pageYOffset;"));
//		
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//HIGHLIGHTING THE WEB ELEMENT:
		WebElement q = driver.findElement(By.xpath("//input[@name='q']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1700);
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", q);
		
		
		
		
		
	}

}
