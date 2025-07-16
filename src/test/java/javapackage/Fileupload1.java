package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload1 {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		String file1 = "C:\\Users\\sai\\OneDrive\\Desktop\\krishna documentation.docx";
		String file2 = "D:\\Downloadss\\Brillio Background.jpg";
		
		driver.findElement(By.id("filesToUpload")).sendKeys(file1 +"\n"+ file2);
		
		
		String fltxt1 = driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText();
		String fltxt2 = driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText();
		
		if(fltxt1.equals("krishna documentation.docx") && fltxt2.equals("Brillio Background.jpg"))
		{
			System.out.println("File names are matching");
		}
		else
		{
			System.out.println("File names are not matching");
		}
		
	}

}
