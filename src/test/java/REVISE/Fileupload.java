package REVISE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		WebElement file1 = driver.findElement(By.id("filesToUpload"));
		file1.sendKeys("C:\\Users\\sai\\OneDrive\\Pictures\\__sadiesink__fandom_1645245813554627.jpg"+"\n"
				+ "C:\\Users\\sai\\OneDrive\\Pictures\\1649515852151.jpg");
		

		
	}

}
