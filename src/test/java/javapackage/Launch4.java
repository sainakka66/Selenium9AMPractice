package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch4 {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser:
		WebDriver driver = new ChromeDriver();
		
		//Launch the application:
		driver.get("https://www.facebook.com/");
		
		//click on Create new account button:
		Thread.sleep(5000); //5000 MILLISECONDS = 5 SECONDS.
		driver.findElement(By.linkText("Create new account")).click();
		
		//Fill the data into the text boxes/fields:
		driver.findElement(By.name("firstname")).sendKeys("SAI");
		Thread.sleep(5000);
		driver.findElement(By.name("lastname")).sendKeys("NAKKA");
		Thread.sleep(5000);
		driver.findElement(By.name("reg_email__")).sendKeys("9346376966");
		Thread.sleep(5000);
		driver.findElement(By.id("password_step_input")).sendKeys("Sainakka@123");
		
	}

}
