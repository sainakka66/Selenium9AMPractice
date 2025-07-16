package REVISE;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		 File source = ts.getScreenshotAs(OutputType.FILE);
//		 File target = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpagee.png");
//		                       //System.getProperty("user.dir"):   This will stores in entire system;
//		                       //(/com.SELENIUM9AMMPRACTICE/Screenshots): This will only stores in this particular exact location.
//		 source.renameTo(target);
//		 
//		// .renameTo:- transfer the Screenshot from source file to target file;
//		 
		//-------------------------------------------------------------------
//		
//		WebElement cric = driver.findElement(By.xpath("//strong[text()='Featured products']"));
//		File source = cric.getScreenshotAs(OutputType.FILE);
//		File target = new File(System.getProperty("user.dir")+"\\Screenshots\\Ahalf.png");
//		source.renameTo(target);
//		
		
		//-------------------------------------------------------------------
		
		
		WebElement logi = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File source = logi.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		source.renameTo(destination);
		
		
		
		
		////img[@alt='nopCommerce demo store']
		
		
		
		
		 
	}

}
