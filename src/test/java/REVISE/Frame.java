package REVISE;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		URL myurl = new URL("https://ui.vision/demo/webtest/frames/");
		driver.navigate().to(myurl);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		WebElement fm1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(fm1);
		driver.findElement(By.name("mytext1")).sendKeys("Sai Nakka");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement fm2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(fm2);
		driver.findElement(By.name("mytext2")).sendKeys("Appalaraju Nakka");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement fm3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(fm3);
		driver.findElement(By.name("mytext3")).sendKeys("Anantha Lakshmi Nakka");
		Thread.sleep(2000);
		
		//iframe:::
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='I am a human']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement fm4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(fm4);
		driver.findElement(By.name("mytext4")).sendKeys("Vaishnavi Nakka");
		
	}

}
