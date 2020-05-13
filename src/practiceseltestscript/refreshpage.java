package practiceseltestscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class refreshpage 
{
	//Using Navigate.refresh()
	//get(get.currenturl)
	//using robot class
	//Using javascritpexecutor

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("arvindh mk");
		
		Thread.sleep(4000);
		
		//driver.navigate().refresh();
		
		//driver.get(driver.getCurrentUrl());
		
//		Robot rb = new Robot();
//		
//		rb.keyPress(KeyEvent.VK_F5);
//		rb.keyRelease(KeyEvent.VK_F5);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("location.reload()");
		js.executeScript("history.go(0)");
		
		
	}

}
