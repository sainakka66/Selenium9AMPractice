package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Locatorcss {

	public static void main(String[] args) {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//tag#id:
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Laptop");
		

	}

}
