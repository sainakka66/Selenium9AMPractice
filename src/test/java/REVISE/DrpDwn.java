package REVISE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrpDwn {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/newtours/");
		Thread.sleep(2800);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		Thread.sleep(2800);
		
		WebElement dd = driver.findElement(By.name("country"));

		
		Select ddl = new Select(dd);
		Thread.sleep(2800);
		//ddl.selectByVisibleText("INDIA");
		//ddl.selectByIndex(4);
		List<WebElement> all =  ddl.getOptions();
		
		System.out.println(all.size());
		
		
		for(WebElement op4:all)
		{
			System.out.println(op4.getText());
		}
		
	}

}






////select[@name='country']
//////a[text()='REGISTER']