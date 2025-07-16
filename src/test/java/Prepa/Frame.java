package Prepa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		
		 WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		 driver.switchTo().frame(frame1);
		 Thread.sleep(2200);
		 driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("  I  ");
		 
		 driver.switchTo().defaultContent();
		 
		 WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		 driver.switchTo().frame(frame2);
		 Thread.sleep(2200);
		 driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("  WILL  ");
		 
		 driver.switchTo().defaultContent();
		 
		 WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		 driver.switchTo().frame(frame3);
		 Thread.sleep(2200);
		 driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("  BECOME  ");
		 
		 driver.switchTo().defaultContent();
		 
		 WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		 driver.switchTo().frame(frame4);
		 Thread.sleep(2200);
		 driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("  HOKAGE  ");
		
	}

}
