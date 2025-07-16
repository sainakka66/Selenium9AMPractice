package REVISE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		WebElement content = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		content.sendKeys("Indian batter Ruturaj Gaikwad is all set for his maiden stint in the County Championship after bagging a deal with Yorkshire. Gaikwad will join the squad ahead of their Championship fixture against Surrey next month");
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		
	}

}
