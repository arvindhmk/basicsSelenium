package practiceseltestscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingframes 
{
	//Frames are the part of webpage or browser which displays content independent of the container with ability to load content independently 
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		//frame1
		WebElement frame1button = driver.findElement(By.xpath("//button[@id='Click']"));
		frame1button.click();
		
		driver.switchTo().defaultContent();
		
		//frame2
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame2");
		
		WebElement frame2button = driver.findElement(By.xpath("//button[@id='Click1']"));
		frame2button.click();
		
		driver.switchTo().defaultContent();
		
		//finding total number of frames
		
		int framecount = driver.findElements(By.tagName("iframe")).size();

		System.out.println("framecount =="+framecount);
		
	}

}
