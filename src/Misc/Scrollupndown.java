package Misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrollupndown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/");
	JavascriptExecutor je = (JavascriptExecutor)driver;
	Thread.sleep(3000);
	je.executeScript("scroll(0,300)");
	Thread.sleep(3000);
	je.executeScript("scroll(0,-300)");
	driver.close();
	}

}
