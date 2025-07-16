package Prepa;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakescreenShot {

	public static void main(String[] args) 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File target = new File(System.getProperty("user.dir") + "\\Screenshots\\fullwindow.png");
//		source.renameTo(target);
		
//		WebElement particular = driver.findElement(By.xpath("//img[@alt='Picture of Build your own computer']"));
//		File source = particular.getScreenshotAs(OutputType.FILE);
//		File target = new File(System.getProperty("user.dir") + "\\Screenshots\\particular.png");
//		source.renameTo(target);
		
		WebElement specific = driver.findElement(By.xpath("//div[@class='footer-upper']"));
		File source = specific.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "\\Screenshots\\specifc.png");
		source.renameTo(target);
		
	}

}
