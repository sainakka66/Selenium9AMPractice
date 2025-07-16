package REVISE;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLnavigateto {

	public static void main(String[] args) throws MalformedURLException 
	{
		
		WebDriver driver = new ChromeDriver();
		URL myurl = new URL("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.navigate().to(myurl);
		
	}

}
