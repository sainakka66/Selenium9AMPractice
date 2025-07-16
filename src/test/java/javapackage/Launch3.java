package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		
		d.navigate().to("https://www.youtube.com/live/JkqoXmXKud0?si=YIZrbmokam7TrVD9");
		
		Thread.sleep(5000);
		
		d.navigate().back();
		Thread.sleep(5000);
		
		d.navigate().forward();
		Thread.sleep(5000);
		
		d.navigate().refresh();
		
	}

}
