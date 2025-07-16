package REVISE;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfrmAlert {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		URL myurl = new URL("https://the-internet.herokuapp.com/javascript_alerts");
		driver.navigate().to(myurl);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		alert.dismiss();
		
		
	}

}
