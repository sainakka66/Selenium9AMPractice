package REVISE;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twowndsclosing1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/");
		driver.findElement(By.xpath("//a[text()='Try it Yourself']")).click();
		
		Set<String> wids = driver.getWindowHandles();
		System.out.println(wids);
		
		List<String> windows = new ArrayList(wids);
		System.out.println(windows);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(2800);
		
		driver.close();
		
	}

}
