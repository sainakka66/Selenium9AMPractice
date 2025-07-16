package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) 
	{
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        
       String title  = driver.getTitle();
       System.out.println(title);
		
	}

}
