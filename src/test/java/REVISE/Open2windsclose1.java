package REVISE;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Open2windsclose1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		URL myurl = new URL("http://www.w3schools.com");
		driver.navigate().to(myurl);
		Thread.sleep(2800);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Try it Yourself']")).click();
		Thread.sleep(2800);

		Set<String> wids = driver.getWindowHandles();
		System.out.println(wids);
		List<String> fetch = new ArrayList(wids);
		System.out.println(fetch);
		
        String parent = fetch.get(0);
        String child = fetch.get(1);
        
        driver.switchTo().window(child);
        System.out.println(driver.getCurrentUrl());
		
		
	}

}
