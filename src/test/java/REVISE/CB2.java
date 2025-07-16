package REVISE;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CB2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		URL myurl = new URL("https://www.letskodeit.com/practice");
		driver.navigate().to(myurl);
		driver.manage().window().maximize();
		

        List<WebElement> cbs = driver.findElements(By.xpath("//input[@name='cars' and @type='checkbox']"));
        System.out.println(cbs.size());
        
//        for(WebElement cb:cbs)
//        {
//        	cb.click();
//        }
        
//        for(int i=0; i<cbs.size(); i++)
//        {
//        	cbs.get(i).click();
//        }

        //selecting last 2 CBS: (formula: (how many checkboxes = 3) - (how many CBS i need to select = 2) = 1);
//        for(int i=1; i<cbs.size(); i++)
//        {
        
        
//        	cbs.get(i).click();
//        }
        
        
        //selecting random boxes;
//        for(int i=0; i<cbs.size(); i++)
//        {
//        	if(i==0 || i==1)
//        	{
//        		cbs.get(i).click();
//        	}
//        }
        
        
        //SELECTING & UNSELECTING;
        for(WebElement cb:cbs)
        {
        	if(cb.isSelected())
        	{
        		cb.click();
        	}
        	else
        	{
        		cb.click();
        	}
        }
        
        
        
        for(WebElement cb:cbs)
        {
        	if(cb.isSelected())
        	{
        		cb.click();
        	}
        	else
        	{
        		cb.click();
        	}
        }



        
	}

}
