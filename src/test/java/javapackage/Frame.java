package javapackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Frame {

	public static void main(String[] args) 
	{	
	
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
