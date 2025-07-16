package javapackage;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("SAI");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("NAKKA");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sainakka6@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Sainakka6@");
		
	}

}
