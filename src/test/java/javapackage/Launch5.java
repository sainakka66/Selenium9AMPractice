package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch5 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.name("firstName")).sendKeys("SAI");
		Thread.sleep(5000);
		driver.findElement(By.name("lastName")).sendKeys("NAKKA");
		Thread.sleep(5000);
		driver.findElement(By.name("phone")).sendKeys("9346376966");
		Thread.sleep(5000);
		driver.findElement(By.id("userName")).sendKeys("SAI@847");
		Thread.sleep(5000);
		driver.findElement(By.name("address1")).sendKeys("JAGAPATHINAGARAM");
		Thread.sleep(5000);
		driver.findElement(By.name("city")).sendKeys("KIRLAMPUDI");
		Thread.sleep(5000);
		driver.findElement(By.name("state")).sendKeys("ANDHRA PRADESH");
		Thread.sleep(5000);
		driver.findElement(By.name("postalCode")).sendKeys("533431");
		}

}
