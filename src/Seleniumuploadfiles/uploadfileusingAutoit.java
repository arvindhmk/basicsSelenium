package Seleniumuploadfiles;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfileusingAutoit 
{

	public static void main(String args[]) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_excel");
		driver.findElement(By.id("pickfiles")).click();
				Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\autoit\\fileupload.exe");
		//uploaad autoit script	
	}
}
