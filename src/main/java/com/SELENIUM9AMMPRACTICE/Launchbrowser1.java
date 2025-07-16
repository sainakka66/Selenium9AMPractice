package com.SELENIUM9AMMPRACTICE;
//import java.util.Set;


//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser1 {

	public static void main(String[] args) throws InterruptedException {
		
		//MANUAL TESTERS WILL GIVE THE 3 STEPS.
		
		//Launch the Browser:
		//WebDriver driver = new ChromeDriver();
		//RemoteWebDriver driver1 = new ChromeDriver();
		
		//Launch the application:
		//driver.get("https://www.youtube.com/");
		
		Thread.sleep(5000);
		//driver.get("http://www.w3schools.com");
		
		//get the TITLE of the page:
		//String x = driver.getTitle();
		//System.out.println("The Title is: " + x);
		
		//get PAGE source:
		//String c  = driver.getPageSource();
		//System.out.println(c);
		
		//get PAGE URL:
		//Why we mentioning string, because it is going to written something.
		//String u = driver.getCurrentUrl();
		//System.out.println(u);
		
		//get WINDOW ID : whatever the window ( ex: IRCTC platform window ), those windows will consists of one unique ID.
		//String id = driver.getWindowHandle();
		//System.out.println(id);
		
		//get WINDOWHANDLES :
		//identify the element and click the ( HISTORY ) link.
		driver.findElement(By.linkText("History")).click();
		Thread.sleep(5000);
		
		//Set<String> wids = driver.getWindowHandles();
		//System.out.println(wids);
		
		//close the window.
		driver.close();
		
	}

}
