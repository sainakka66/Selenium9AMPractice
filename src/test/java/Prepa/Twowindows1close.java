package Prepa;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Twowindows1close {

	public static void main(String[] args) throws InterruptedException 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com");
		driver.manage().window().maximize();
		Thread.sleep(2700);
		
		driver.findElement(By.xpath("//a[text()='Try it Yourself']")).click();
		
		Set<String> wids = driver.getWindowHandles();
		List<String> wid = new ArrayList(wids);
		//System.out.println(wid);
		
		 String parent = wid.get(0);
		 System.out.println(parent);
		 
		 String child = wid.get(1);
		 System.out.println(child);
		 
		 driver.switchTo().window(child);
		 System.out.println(driver.getTitle());
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().window(parent);
		 System.out.println(driver.getTitle());
		 Thread.sleep(2000);
		 
		 driver.close();
		 
		
	}

}
