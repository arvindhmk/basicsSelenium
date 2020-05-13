package practiceseltestscript;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class downloadfiles 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		driver.get("http://www.leafground.com/pages/download.html");
		
		driver.findElement(By.linkText("Download Excel")).click();
		
		//driver.findElement(By.linkText("Download PDF")).click();
		
		//driver.findElement(By.linkText("Download Text")).click();
		
		Thread.sleep(4000);
	
		File filelocation = new File("C:\\Users\\user\\Downloads");
		
		File[] totalfiles=filelocation.listFiles();
	
		for(File filename:totalfiles)
		{
			if(filename.getName().equals("testleaf.xlsx"))
			{
				System.out.println("File is downloaded");
				break;
			}
		}
		
		
		driver.findElement(By.linkText("Download PDF")).click();
	
		Thread.sleep(7000);
		
		File pdflocation = new File("C:\\Users\\user\\Desktop");
		
	File[] filedesktop = pdflocation.listFiles();
	
	for(File filename2:filedesktop)
	{
	
		if(filename2.getName().equals("testleaf.pdf"))
		{
			System.out.println("pdf file exists");
			break;
		}
		
	}		
}

}
