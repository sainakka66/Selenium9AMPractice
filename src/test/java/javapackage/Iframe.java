package javapackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Iframe {

	public static void main(String[] args) 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//ENTER THE DATA INTO THE TEXTBOX:
		 WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		 driver.switchTo().frame(frame1);
		
		driver.findElement(By.name("mytext1")).sendKeys("1ST frame");
		
		          
		
		
		
	}

}
