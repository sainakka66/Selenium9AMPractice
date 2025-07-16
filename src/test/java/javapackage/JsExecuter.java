package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JsExecuter {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("principal")).sendKeys("500000");
		Thread.sleep(1800);
		driver.findElement(By.id("interest")).sendKeys("10");
		Thread.sleep(1800);
		driver.findElement(By.id("tenure")).sendKeys("5");
		
		WebElement tp = driver.findElement(By.id("tenurePeriod"));
		Select tpdd = new Select(tp);
		tpdd.selectByVisibleText("year(s)");
		Thread.sleep(1200);
		
		WebElement fq = driver.findElement(By.id("frequency"));
		Select fqdd = new Select(fq);
		fqdd.selectByVisibleText("Simple Interest");
		Thread.sleep(1200);
		
		WebElement calc = driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", calc);
		
	}

}
