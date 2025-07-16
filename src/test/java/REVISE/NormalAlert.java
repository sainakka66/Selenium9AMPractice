package REVISE;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalAlert {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		URL myurl = new URL("https://the-internet.herokuapp.com/javascript_alerts");
		driver.navigate().to(myurl);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement alt = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		alt.click();
		
		Alert alert = driver.switchTo().alert(); 
		Thread.sleep(2000);
		alert.accept();
		
	}

}
