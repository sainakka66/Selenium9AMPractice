package javapackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		Thread.sleep(2400);
		
		//click on cancel button:
		alert.dismiss();
		
		 String exp_msg = "You clicked: Cancel";
		 String rl_msg = driver.findElement(By.xpath("//p[text()='You clicked: Cancel']")).getText();
		 
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
