package REVISE;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Launch3browsers {

	public static void main(String[] args) 
	{
		String browser;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid browser name: ");
		browser = sc.nextLine();
		
		WebDriver driver;
		
		if(browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else  if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid Browser NAME");
		}
		
	}

}
