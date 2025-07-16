package Prepa;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlesAndwindowHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.w3schools.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Try it Yourself' and @class='w3-button ga-fp tryit-button']")).click();
		

		Set<String> windowList = driver.getWindowHandles();
		System.out.println(windowList);
		List<String> wids = new ArrayList(windowList);
		
	    String parent = wids.get(0);
	    System.out.println(parent);
	    
	    String child = wids.get(1);
	    System.out.println(child);
	    
	    driver.switchTo().window(child);
	    System.out.println(driver.getTitle());
	    
	    Thread.sleep(2000);
		
	    driver.switchTo().window(parent);
	    System.out.println(driver.getTitle());
	}

}
