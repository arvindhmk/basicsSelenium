package Misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Refreshpageusingselenium 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.navigate().refresh();
		System.out.println("Navigate refresh");
		Thread.sleep(2000);
		driver.navigate().to(driver.getCurrentUrl());
		System.out.println("using getCurrenturl");
		
		
		
	}

}
