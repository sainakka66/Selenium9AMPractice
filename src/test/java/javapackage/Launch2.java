package javapackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the BROWSER.
		WebDriver d2 = new ChromeDriver();
		
		//Launch the Application:
		d2.get("https://www.youtube.com/");
		
		//Identify the element:
		d2.findElement(By.linkText("History")).click();
		
		Set<String> wid = d2.getWindowHandles();
		System.out.println(wid);
		
		List<String> windows = new ArrayList<String>(wid);
		System.out.println(windows);
		
		//close the 2nd window:
		d2.switchTo().window(windows.get(1));
		Thread.sleep(5000);
		d2.close();
	}

}
