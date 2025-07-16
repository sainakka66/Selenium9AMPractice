package javapackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//Method1:
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		  String  exp_msg = "You successfully clicked an alert";
		  
		  String  rl_msg = driver.findElement(By.xpath("//p[@id='result']")).getText();
		  
		  if(exp_msg.equals(rl_msg))
		  {
			  System.out.println("Test Pass");
		  }
		  else
		  {
			  System.out.println("Test Fail");
		  }
		
	}

}
