package javapackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot1 {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://play.google.com/store/games?device=windows");
		driver.manage().window().maximize();
		
	/*	TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"\\Screenshots\\fhoto1.png");
		// /com.SELENIUM9AMMPRACTICE/Screenshots == System.getProperty("user.dir"):- But this will save in entire system;
		source.renameTo(destination);  */
		
	/*	 WebElement Fp = driver.findElement(By.xpath("//div[@class='VfPpkd-EScbFb-JIbuQc jVR3ye']"));
		 File source = Fp.getScreenshotAs(OutputType.FILE);
		 File destination = new File(System.getProperty("user.dir")+"\\Screenshots\\fhoto2.png");
		 source.renameTo(destination);  */
		 
		 WebElement Gp = driver.findElement(By.xpath("//a[@class='f0UV3d']"));
		 File source = Gp.getScreenshotAs(OutputType.FILE);
		 File destination = new File(System.getProperty("user.dir")+"\\Screenshots\\fhoto3.png");
		 source.renameTo(destination);
		 
		 

	}

}
