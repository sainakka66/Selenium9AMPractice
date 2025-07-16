package REVISE;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		URL myurl = new URL("https://the-internet.herokuapp.com/javascript_alerts");
		driver.navigate().to(myurl);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("The text is: "+alert.getText());
		
		alert.sendKeys("M S DHONI");
		alert.accept();
		
		String txt = driver.findElement(By.xpath("//p[text()='You entered: M S DHONI']")).getText();
		
		if(txt.contains("M S DHONI"))
		{
			System.out.println("Testcase PASS");
		}
		else
		{
			System.out.println("Testcase FAIL");
		}
		
		
		
		
	}

}
