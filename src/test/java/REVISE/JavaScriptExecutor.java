package REVISE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException 
	{
		
		RemoteWebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		Thread.sleep(2800);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("principal")).sendKeys("800000");
		Thread.sleep(2000);
		
		driver.findElement(By.id("interest")).sendKeys("10");
		Thread.sleep(2000);
		
		driver.findElement(By.id("tenure")).sendKeys("5");
		Thread.sleep(2000);
		
		WebElement tpdd = driver.findElement(By.id("tenurePeriod"));
		Select tp = new Select(tpdd);
		tp.selectByVisibleText("year(s)");
		Thread.sleep(2400);
		
		WebElement fqdd = driver.findElement(By.id("frequency"));
		Select fq = new Select(fqdd);
		fq.selectByVisibleText("Simple Interest");
		Thread.sleep(2400);
		
		WebElement calc = driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", calc);
		
	}

}
