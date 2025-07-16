package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Onw {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=OmFuPZUUoEw");
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);

		
		driver.get("https://chatgpt.com/c/68384c36-3eb8-8005-a7a6-dd356f60c1bc");
		
	}

}
