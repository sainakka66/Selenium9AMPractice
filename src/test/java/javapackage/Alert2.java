package javapackage;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2500);
		System.out.println(alert.getText());
		
		alert.sendKeys("M S DHONI");
		alert.accept();
		
	}

}
