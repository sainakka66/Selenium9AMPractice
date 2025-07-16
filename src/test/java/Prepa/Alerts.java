package Prepa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
//	 	  WebElement normal = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//	 	  normal.click();
//	 	  Thread.sleep(2500);
//	 	  driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2500);
		driver.switchTo().alert().dismiss();
		
        String text = driver.findElement(By.xpath("//p[text()='You clicked: Cancel']")).getText();
        
        if(text.equals("You clicked: Cancel"))
        {
        	System.out.println("Test pass");
        }
        else
        {
        	System.out.println("Test Fail");
        }
	 	  
	 	  
	 	  
	}

}
