package Prepa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class JSCalculator {

	public static void main(String[] args) throws InterruptedException 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		
		driver.findElement(By.id("principal")).sendKeys("500000");
		Thread.sleep(2000);
		driver.findElement(By.id("interest")).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(By.id("tenure")).sendKeys("4");
		
		WebElement tenurePeriod = driver.findElement(By.id("tenurePeriod"));
		Select select = new Select(tenurePeriod);
		Thread.sleep(2000);
		select.selectByVisibleText("year(s)");
		
		WebElement frequency = driver.findElement(By.id("frequency"));
		Select select1 = new Select(frequency);
		Thread.sleep(2000);
		select1.selectByVisibleText("Simple Interest");
		
		WebElement calc = driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", calc);
		
	}

}
