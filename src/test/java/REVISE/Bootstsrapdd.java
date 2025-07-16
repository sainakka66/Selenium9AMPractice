package REVISE;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Bootstsrapdd {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		Thread.sleep(2800);
		driver.findElement(By.xpath("//button[starts-with(@class,'multiselect')]")).click();
		
		List<WebElement>  options = driver.findElements(By.xpath("//ul[starts-with(@class,'multiselect')]//li"));
		System.out.println(options.size());
		
		for(int i=0; i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
	}

}
