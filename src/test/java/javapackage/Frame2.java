package javapackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Frame2 {

	public static void main(String[] args) 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//switch to 1st frame;
		 WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		 driver.switchTo().frame(frame1);
		 driver.findElement(By.name("mytext1")).sendKeys("1st frame");
		 
		 //switch to parent window/ default content;
		 driver.switchTo().defaultContent();  //driver.switchTo().parentFrame()
		 
			//switch to 1st frame;
		 WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		 driver.switchTo().frame(frame2);
		 driver.findElement(By.name("mytext2")).sendKeys("2nd frame");
		 
		//switch to parent window/ default content;
		 driver.switchTo().defaultContent();  //driver.switchTo().parentFrame()
		 
		 
		 WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		 driver.switchTo().frame(frame3);
		 //driver.findElement(By.name("mytext3")).sendKeys("3rd frame");
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
		 
		 
		 
		 
		//switch to parent window/ default content;
		 driver.switchTo().defaultContent();  //driver.switchTo().parentFrame()
		 
		 WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		 driver.switchTo().frame(frame4);
		 driver.findElement(By.name("mytext4")).sendKeys("4th frame");
	}

}
